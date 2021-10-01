import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("smith", 14);
        //todo put: Liên kết giá trị được chỉ định với khóa được chỉ định trong bản đồ này (thao tác tùy chọn).
        hashMap.put("ThaiVu", 23);
        hashMap.put("Lewis", 29);
        System.out.println("Display entries in Hashmap");
        System.out.println(hashMap + "\n");

        //todo luu theo thu tu giam dan
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("display entries in ascending order of key");
        System.out.println(treeMap);

        //todo luu danh sach sinh vien va hien thi du lieu
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("ThaiVu", 23);
        linkedHashMap.put("anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 13);
        System.out.println("\nThe age for Lewis is "+linkedHashMap.get("Lewis"));
        //! get: Trả về giá trị mà khóa đã chỉ định được ánh xạ hoặc null nếu bản đồ này không chứa ánh xạ cho khóa.
    }
}
