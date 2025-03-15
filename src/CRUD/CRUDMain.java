package CRUD;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class CRUDMain {
    public static void main(String[] args) {

        // TODO DATABASE
        // Баштапкы массив
        Customer[] customers = new Customer[0];

        // Customer кызматын башкаруучу класс (методдорду чакыруу үчүн)
        Customer customerService = new Customer();

        // 1️⃣ ЖАҢЫ КАРДАРЛАРДЫ ТҮЗӨБҮЗ
        Customer c1 = new Customer();
        c1.setID(1);
        c1.setFirstName("Aman");
        c1.setGmail("aman@gmail.com");
        c1.setLocalDate(LocalDate.of(1995, 5, 12));
        c1.setPhone("+996700112233");

        Customer c2 = new Customer();
        c2.setID(2);
        c2.setFirstName("Asel");
        c2.setGmail("asel@gmail.com");
        c2.setLocalDate(LocalDate.of(1998, 8, 25));
        c2.setPhone("+996701223344");

        // 2️⃣ КАРДАРЛАРДЫ МАССИВГЕ КОШОБУЗ
        customers = customerService.createCustomer(customers, c1);
        customers = customerService.createCustomer(customers, c2);

        System.out.println("\n📌 Бардык кардарлар:");
        System.out.println(Arrays.toString(customers));

        // 3️⃣ ID боюнча кардарды издөө
        long searchId = 2;
        Customer foundCustomer = customerService.getById(searchId, customers);
        if (foundCustomer != null) {
            System.out.println("\n🔍 Табылган кардар (ID=" + searchId + "):\n" + foundCustomer);
        } else {
            System.out.println("\n❌ Кардар табылган жок!");
        }

        // 4️⃣ КАРДАРДЫ ЖАҢЫРТУУ
        Customer updatedCustomer = new Customer();
        updatedCustomer.setFirstName("Aselbek"); // Аты өзгөрдү
        updatedCustomer.setGmail("aselbek@gmail.com");
        updatedCustomer.setLocalDate(LocalDate.of(1998, 8, 25));
        updatedCustomer.setPhone("+996701998877");

        customers = customerService.updateCustomerById(2, customers, updatedCustomer);
        System.out.println("\n✏️ Жаңыртылган кардарлар:");
        System.out.println(Arrays.toString(customers));

        // 5️⃣ КАРДАРДЫ ӨЧҮРҮҮ
        long deleteId = 1;
        customers = customerService.deleteCustomerById(deleteId, customers);
        System.out.println("\n🗑️ " + deleteId + "-ID'ли кардар өчүрүлгөндөн кийин:");
        System.out.println(Arrays.toString(customers));
    }
}