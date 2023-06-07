package Repository;

import beans.Categories;
import beans.Products;

import java.sql.SQLException;

public class TestProductsImpl {

        public static void main(String[] args) throws SQLException {
            Repository<Products> repository = new ProductsRepositoryImpl();
            System.out.println("========= saveObj Insert ====== ");

            Products productsInsert = new Products();
            productsInsert.setProduct_name("Lacteos");

            repository.saveObj(productsInsert);

            productsInsert = new Products();
            productsInsert.setProduct_name("Lacteos");

            repository.saveObj(productsInsert);



            System.out.println("===== listAllObj====== " );
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("- by IdObj =");
            System.out.println(repository.byIdObj(1));
            System.out.println();

            System.out.println("===== saveObj======  " );
            Products productUpdate = new Products();
            productUpdate.setProduct_id(2);
            productUpdate.setProduct_name("vegetales");
            productUpdate.setProduct_value (8F);

            // repository.(userUpdate);
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("====delete0bj=====");
            repository.deleteObj(14);
            repository.listAllObj().forEach(System.out::println);
        }
    }


