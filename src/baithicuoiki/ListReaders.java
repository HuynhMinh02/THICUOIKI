package baithicuoiki;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import baithicuoiki.entity.Readers;

public class ListReaders {
    public static void main(String[] args) {
        
        Readers r1 = new Readers("R00001", "Nguyen Van Anh" , "Hoc Sinh" , "0398989890","Quan 1","nva@gmail.com", null);
        Readers r2 = new Readers("R00002", "Tran Van Binh" , "Sinh Vien" , "0312121212","Quan 2","tvb@gmail.com", null);
        Readers r3 = new Readers("R00003", "Le Thi Cam" , "Sinh Vien" , "0323232323","Quan 3","ltc@gmail.com", null);
        Readers r4 = new Readers("R00004", "Thi Kim Dinh" , "Sinh Vien" , "0334343434","Quan 4","tkd@gmail.com", null);
        Readers r5 = new Readers("R00005", "Huynh Thi Cam Giang" , "Hoc Sinh" , "0345454545","Quan 5","htcg@gmail.com", null);
        Readers r6 = new Readers("R00006", "Nguyen Thi Lua" , "Sinh Vien" , "0356565656","Quan 6","ntl@gmail.com", null);
        Readers r7 = new Readers("R00007", "Nguyen Van Hao" , "Cong Nhan" , "0367676767","Quan 7","nvh@gmail.com", null);
        Readers r8 = new Readers("R00008", "Nguyen Quoc Khanh" , "" , "0378787878","Quan 8","nqk@gmail.com", null);
        Readers r9 = new Readers("R00009", "Tran Quang Truong" , "Giang Vien" , "0311122233","Quan 9","tqt@gmail.com", null);
        Readers r10 = new Readers("R00010", "Bui Van Giang" , "Nhan Vien Van Phong" , "0333344455","Quan 10","bvg@gmail.com", null);
        Readers r11 = new Readers("R00011", "Le Thi Tim" , "Noi Tro" , "0355566667","Quan 11","ltt@gmail.com", null);
        Readers r12 = new Readers("R00012", "Huynh Huu Tai" , "Bao Ve" , "0367778888","Quan 12","hht@gmail.com", null);
        Readers r13 = new Readers("R00013", "Le Thi Nhu Ngoc" , "Giang VIen" , "0387787887","Quan Binh Thanh","ltnn@gmail.com", null);
        Readers r14 = new Readers("R00014", "Duong Thi Truc Dao" , "Giang Vien" , "0355667788","Quan Binh Tan","dttd@gmail.com", null);
        Readers r15 = new Readers("R00015", "Le Quang Trung" , "Giang Vien" , "0312345678","Go Vap","lqt@gmail.com", null);


        List<Readers> listReaders = new ArrayList<>();

        listReaders.add(r1);
        listReaders.add(r2);
        listReaders.add(r3);
        listReaders.add(r4);
        listReaders.add(r5);
        listReaders.add(r6);
        listReaders.add(r7);
        listReaders.add(r8);
        listReaders.add(r9);
        listReaders.add(r10);
        listReaders.add(r11);
        listReaders.add(r12);
        listReaders.add(r13);
        listReaders.add(r14);
        listReaders.add(r15);

        Gson gson = new Gson();

        try (FileWriter write = new FileWriter("listReaders.json")){
            gson.toJson(listReaders, write);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
