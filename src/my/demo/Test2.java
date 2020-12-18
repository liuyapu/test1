package my.demo;

import java.util.*;

//list map常见方法
//map采取的是键值对存储
public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.testArrayList();
        test2.testMap();
    }
    public void testArrayList(){
        ArrayList<String> arrayList = new ArrayList<>();
        //添加元素
        arrayList.add("a");
        arrayList.add("b");

        //如果原来下标有元素，则将原来下标的元素替换，原来的元素及元素之后的元素向后移动
        arrayList.add(0,"c");
        arrayList.add("a");
        System.out.println("arraylist数组中的元素有："+arrayList);

        //检查数组链表中是否包含某元素
        boolean bl1 = arrayList.contains("a");
        System.out.println("链表是否包含元素a："+bl1);
        //检查元素的位置
        int position = arrayList.indexOf("a");
        System.out.println("元素a的位置："+position);

        //检查元素最后出现的位置
        position = arrayList.lastIndexOf("a");
        System.out.println("元素a最后出现的位置："+position);

        //检查链表是否为空
        boolean bl = arrayList.isEmpty();
        System.out.println("链表是否为空："+bl);

        //获取指定位置上的元素
        Object obj = arrayList.get(0);
        System.out.println("下标0处的元素为: "+obj);

        //获取链表的大小
        int size = arrayList.size();
        System.out.println("数组链表的大小/数组内的元素个数为："+size);

        //遍历数组链表
        System.out.println("使用普通for循环：");
        for (int i = 0;i < arrayList.size();i++){
            System.out.println("Index: "+i+"-Item: "+arrayList.get(i));
        }

        //使用foreach循环
        System.out.println("使用foreach：");
        for(Object obj2:arrayList){
            System.out.println("Item is :"+obj2);
        }

        //使用迭代器
        System.out.println("使用迭代器循环输出：");
        for(Iterator<String> iterator = arrayList.iterator();iterator.hasNext();){
            System.out.println("Item is: "+iterator.next());
        }

        //替换元素
        arrayList.set(3,"n");
        System.out.println("替换后的数组链表为："+arrayList);

        //移除指定位置元素
        arrayList.remove(3);
        System.out.println("移除下表为3后的数组链表为："+arrayList);

        //移除第一次找到的元素
        arrayList.remove("b");
        System.out.println("移除b元素后的数组链表为："+arrayList);

        //数组链表的clone
        ArrayList<String> arraylist2 = (ArrayList<String>) arrayList.clone();
        System.out.println("clone后的数组链表为："+arraylist2);

        //arraylist转换为array
        String[] strings = arrayList.toArray(new String[arrayList.size()]);
        System.out.println("arraylist转换为array："+ Arrays.toString(strings));


    }

    public void testMap(){
        Map<String,String> hashMap = new HashMap<String,String>();
        //map中的key不允许重复
        hashMap.put("1","周杰伦");
        hashMap.put("0","林俊杰");
        System.out.println("当前map中的元素有："+hashMap);

        //添加map中不存在的元素时返回的是null
        Object object = hashMap.put("2","许嵩");
        System.out.println("添加Key为2，Value为许嵩的返回值为: "+object);

        //添加map中key值已存在的元素时，原来的value会被覆盖，返回的是原来的value值
        object = hashMap.put("2","许嵩222");
        System.out.println("添加key值已经存在返回值是："+object);

        //putAll,向map集合中添加指定集合的所有元素
        Map hashMap2 = new HashMap();
        hashMap2.putAll(hashMap);
        System.out.println("将map中的元素添加到map2后，map2中的元素为："+hashMap2);

        //判断两个map中的元素是否相等
        System.out.println("map和map2是否相等："+hashMap.equals(hashMap2));
        //检查map集合是否包含某key值的元素
        boolean bl = hashMap.containsKey("2");
        System.out.println("map中是否包含key为 2 的元素："+bl);
        bl = hashMap.containsKey("4");
        System.out.println("map中是否包含key值为 4 的元素："+bl);

        //检查map集合中是否包含某value值的元素
        bl = hashMap.containsValue("林俊杰");
        System.out.println("检查map中是否包含Value为 林俊杰 的元素："+bl);
        bl = hashMap.containsValue("陈奕迅");
        System.out.println("检查map中是否包含Value为 陈奕迅 的元素："+bl);


        //获取map中的元素
        Object obj = hashMap.get("1");
        System.out.println("获取key为 1 的元素的value为："+obj);
        //获取的key在map中不存在时会返回null
        obj = hashMap.get("5");
        System.out.println("获取key为 5 的元素的value为："+obj);

        //返回map集合中指定key值的元素的哈希值
        int hashcode = hashMap.get("1").hashCode();
        System.out.println("map中key值为 1 的元素哈希值为："+hashcode);

        //判断hashmap中是否为空
        bl = hashMap.isEmpty();
        System.out.println("map是否为空："+bl);

        //返回map集合中所有的key值
        Set set = hashMap.keySet();
        System.out.println("map中的key值集合为："+set);

        //返回map集合中的所有value值到一个Collection集合
        Collection c = hashMap.values();
        System.out.println("map中的value值集合为："+c);

        //返回map中所有的键值对
        set = hashMap.entrySet();
        System.out.println("map中的所有键值对为："+set);

        //删除key值为key的元素
        hashMap2.remove("2");
        System.out.println("删除key值为 2 的元素后map2为："+hashMap2);

        //获取map中的元素个数
        int size = hashMap.size();
        System.out.println("map中的元素个数为："+size);

        //将map2中的所有键值对清除
        hashMap2.clear();
        System.out.println("清除后的map2为："+hashMap2);

        //遍历map
        //增强for循环,foreach
        System.out.println("\n增强for循环遍历输出：");
        for(Map.Entry<String,String> entry:hashMap.entrySet()){
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }

        //通过key集合迭代器遍历输出
        System.out.println("\n使用key集合迭代器遍历输出：");
        for(Iterator iterator = hashMap.keySet().iterator(); iterator.hasNext();){
            String key = (String) iterator.next();
            System.out.println("key: "+key+" value: "+hashMap.get(key));
        }

        //通过entry集合迭代器遍历输出
        System.out.println("\n使用entry集合迭代器遍历输出：");
        for(Iterator iterator = hashMap.entrySet().iterator();iterator.hasNext();){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
    }
}
