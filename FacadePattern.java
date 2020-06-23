package facade;
public class FacadePattern
{
    public static void main(String[] args)
    {
        Facade f=new Facade();
        f.method();
    }
}
//��۽�ɫ
class Facade
{
    private SubSystem01 obj1=new SubSystem01();
    private SubSystem02 obj2=new SubSystem02();
    private SubSystem03 obj3=new SubSystem03();
    public void method()
    {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
//��ϵͳ��ɫ
class SubSystem01
{
    public  void method1()
    {
        System.out.println("��ϵͳ01��method1()�����ã�");
    }   
}
//��ϵͳ��ɫ
class SubSystem02
{
    public  void method2()
    {
        System.out.println("��ϵͳ02��method2()�����ã�");
    }   
}
//��ϵͳ��ɫ
class SubSystem03
{
    public  void method3()
    {
        System.out.println("��ϵͳ03��method3()�����ã�");
    }   
}