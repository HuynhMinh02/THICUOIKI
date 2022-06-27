package baithicuoiki;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import baithicuoiki.entity.Book;  

public class BookStore {
    public static void main(String[] args) {
        
        Book b1 = new Book("TC0001" ,"Sinh li bo may van dong" ,  "PGS.TS. Luu Quang Hiep" , "NSB Giao Duc" , "2007" , 5.0 , 18 , "Tap chi");
        Book b2 = new Book("GT0001" ,"Lam chu ban than de thay doi cuoc song" ,  "Ruth Fishel" , "Lao Dong" , "" , 5.0 , 10 , "Sach danh cho gioi tre");
        Book b3 = new Book("CTXH0001" ,"Hay troi day VIET NAM! Let's rise, VIET NAM!" ,  "Vu Minh Khuong" , "Tri Thuc" , "2020" , 5.0 , 30 , "Sach Chinh Tri - Xa Hoi");
        Book b4 = new Book("VHNT0001" ,"Nguoi Dua Dieu" ,  "Khaled Hosseini" , "Phu Nu" , "2020" , 5.0 , 15 , "Van Hoc - Nghe Thuat");
        Book b5 = new Book("STN0001" ,"Danh Thuc Bo Nao Con" ,  "Hong Thanh - Nguyen Thi Vi Khanh" , "Van Hoc" , "2020" , 5.0 , 10 , "Sach Thieu Nhi");
        Book b6 = new Book("STN0002" ,"Truyen Ngu Ngon La Fontaine" ,  "Jean de La Fontaine" , "Van Hoc" , "2017" , 5.0 , 5 , "Sach Thieu Nhi");
        Book b7 = new Book("GT0002" ,"Cuoc song cua ban da tot dep chua?" ,  "Marcia Ullett" , "Thanh Hoa" , "2016" , 5.0 , 10 , "Sach danh cho gioi tre");
        Book b8 = new Book("KHCN0001" ,"Suc Bat Cho The He Moi" ,  "Nguyen Hong" , "Tri Thuc" , "2017" , 5.0 , 2 , "Khoa Hoc - Cong Nghe");
        Book b9 = new Book("GT0003" ,"Dac Nhan Tam" ,  "Dale Carnegie" , "NSB tong hop TP.HCM" , "2021" , 5.0 , 50 , "Sach danh cho gioi tre");
        Book b10 = new Book("KHCN0002" ,"Phuong phap luan Dan Da" ,  "Le Minh Tien" , "Tri Thuc" , "2018" , 5.0 , 5 , "Khoa Hoc - Cong Nghe");
        Book b11 = new Book("VHNT0002" ,"Tu Rung Tham AMAZON den Que Huong BOLERO" ,  "Nguyen Tap" , "NSB tong hop TP.HCM" , "" , 5.0 , 10 , "Van Hoc - Nghe Thuat");
        Book b12 = new Book("GT0004" ,"Yeu Nhung Dieu Khong Hoan Hao" ,  "Hae Min" , "The Gioi" , "2018" , 5.0 , 18 , "Sach danh cho gioi tre");
        Book b13 = new Book("QLKT0001" ,"Nha Lanh Dao Khong Chuc Danh (Robin Sharma)" ,  "Robin Sharma - Nguyen Minh Thien Kim dich" , "Tre" , "2020" , 5.0 , 2 , "Quan Li - Kinh Te");
        Book b14 = new Book("GT0005" ,"Chatter - Tro Chuyen Voi Chinh Minh" ,  "Ethan Kross" , "Van Hoa - Van Nghe" , "2019" , 5.0 , 18 , "Sach danh cho gioi tre");
        Book b15 = new Book("NDC0001" ,"Bi an cua Nao Phai" ,  "Makoto Shichida" , "NSB The Gioi" , "2020" , 5.0 , 4 , "Nuoi day con");
        
        
        List<Book> listBook = new ArrayList<>(); 

        listBook.add(b1);   
        listBook.add(b2);
        listBook.add(b3);
        listBook.add(b4);
        listBook.add(b5);
        listBook.add(b6);
        listBook.add(b7);
        listBook.add(b8);    
        listBook.add(b9);
        listBook.add(b10);
        listBook.add(b11);
        listBook.add(b12);
        listBook.add(b13);
        listBook.add(b14);
        listBook.add(b15);


        Gson gson = new Gson();

        try (FileWriter write = new FileWriter("bookStore.json")){
            gson.toJson(listBook, write);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
