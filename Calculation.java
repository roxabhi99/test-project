class Calculation
{
static int a=10;
static int b=30;
static void add()
{
System.out.println(a+b);
}
static void sub()
{
System.out.println(a-b);
}
static void mul()
{
System.out.println(a*b);
}
public static void main(String[]arg)
{
add();
sub();
mul();
System.out.println(a+500);
}
}