class Complex
{
	int real,imag;
		Complex()
			{}
	Complex(int real1,int imag1)
	{
		real=real1;
		imag=imag1;
}
Complex Add(Complex C1,Complex C2)
{
Complex sum=new Complex();
sum.real=C1.real+C2.real;
sum.imag=C1.imag+C2.imag;
return sum;
}
Complex Sub(Complex C1,Complex C2)
{
Complex diff=new Complex();
diff.real=C1.real-C2.real;
diff.imag=C1.imag-C2.imag;
return diff;
}
Complex Mul(Complex C1,Complex C2)
{
Complex Multi=new Complex();
Multi.real=C1.real*C2.real;
Multi.imag=C1.imag*C2.imag;
return Multi;
}

}
 
class Complextest
{
public static void main(String[] a)
{
Complex C1=new Complex(4,8);
Complex C2=new Complex(5,7);
Complex C3=new Complex();


C3=C3.Add(C1,C2);
System.out.println("SUM:" + C3.real +"+i" + C3.imag);
Complex C4=new Complex();
C4=C4.Sub(C1,C2);
System.out.println("DIFF:" + C4.real +"+i" + C4.imag);
Complex C5=new Complex();
C5=C5.Mul(C1,C2);
System.out.println("MULTIPLY:" + C5.real +"+i" + C5.imag);



}
}