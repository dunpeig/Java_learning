public class Example19 {
    public static void main(String[] args) {
        int[] ids = new int[100];
        System.out.println("ids[0]=" + ids[0]);
        ids[0] = 2500;
        System.out.println("ids[0]=" + ids[0]);
        System.out.println("=============");
        String[] names = new String[]{"adam","tom","jack"};
        System.out.println("names[0]=" + names[0]);
        names[0] = "aqua";
        System.out.println("names[0]=" + names[0]);
        System.out.println("=================");
        Object[] object = {"adam","tom","jack"};
        System.out.println("object[0]=" + object[0]);
        object[0] = "aqua";
        System.out.println("object[0]=" + object[0]);
    }

}
