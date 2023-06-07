package Repository;

import beans.Categories;
import beans.User;

import java.sql.SQLException;

public class TestCatgoriesRepositoryImpl {

    public static void main(String[] args) throws SQLException {
        Repository<Categories> repository = new CategoryRepositoryImpl();
        System.out.println("========= saveObj Insert ====== ");

        Categories categoriesInsert = new Categories();
        categoriesInsert.setCategory_name("Lacteos");

        repository.saveObj(categoriesInsert);

        categoriesInsert = new Categories();
        categoriesInsert.setCategory_name("Lacteos");

        repository.saveObj(categoriesInsert);



        System.out.println("===== listAllObj====== " );
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("- by IdObj =");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("===== saveObj======  " );
     Categories categoriesUpdate = new Categories();
        categoriesUpdate.setCategory_id(2);
        categoriesUpdate.setCategory_name("vegetales");

        // repository.(userUpdate);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("====delete0bj=====");
        repository.deleteObj(14);
        repository.listAllObj().forEach(System.out::println);
    }
}

