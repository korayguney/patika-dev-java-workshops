package dev.patika.testdata;

import dev.patika.entity.Customer;
import dev.patika.utils.EntityManagerUtils;
import jakarta.persistence.EntityManager;

public class TestInsuranceModel {

    private static EntityManager entityManager = EntityManagerUtils.getEntityManager("mysqlPU");

    public static void main(String[] args) {
        System.out.println("Begin to save database..............");

        Customer customer = new Customer("Koray Guney", "Dubai UAE", 123456789L, "971505610283");

        try {
            entityManager.getTransaction().begin();
            //Customer customer = entityManager.find(Customer.class, 1);
            //customer.setAddress("Istanbul Turkiye");
            entityManager.persist(customer);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            EntityManagerUtils.closeEntityManager(entityManager);
        }

        System.out.println("Saved to database..............");


    }


}
