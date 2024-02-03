public class Example18 {
public static void main(String[] args) {
    int[] ids = new int[100];
    System.out.println("ids[0]="+ids[0]);
    System.out.println("ids[99]="+ids[99]);
    System.out.println("===============");
    String[] names = new String[] {"adam","tom","jack"};
    System.out.println("names[0]="+names[0]);
    System.out.println("names[2]="+names[2]);
    System.out.println("===============");
    Object[] object = {"adam","tom","jack"};
    System.out.println("length of the object is:"+object.length);
    System.out.println("object[0]="+object[0]);
    System.out.println("object[2]="+object[2]);
}
}
