package notacompras;


import entities.Produto;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NotaCompras {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto product = new Produto();
        List<Produto> list = new ArrayList<>();
        SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");
        Date x = new Date (System.currentTimeMillis());

        System.out.println("How many products will be registered?");
        int n = sc.nextInt();
        
        Double total = 0.0;
        
        for (int i=0; i < n; i++){
            System.out.print("Product: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Quantity: ");
            Integer qnt = sc.nextInt();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            product = new Produto(name, price, qnt);
            list.add(product);
            total += product.totalPrice();
        }
        System.out.println("");
        System.out.println("Shopping note: ");
        System.out.println(sdf1.format(x));
        System.out.println("");
        for (Produto a: list){
        System.out.println(a);
        }
        
        System.out.println("Amount: $ " + total);
        sc.close();
    }

}
