/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labex12;

/**
 *
 * @author Desktop pc
 */
public class searchprgrm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//here we're gonna use genericmethod=>searching an ele
        // TODO code application logic here
        //For Integer
        Integer num[]={1,2,3,4,5,6,7};
        test<Integer,Integer> obj=new test<>();
        obj.search(5, num);
        //For String
        String s[]={"abc","cde","def"};
        test<String,String> obj1=new test<>();
        obj1.search("abc", s);
        //For Double
        Double d[]={1.0,2.0,3.0,4.0,5.0};
        test<Double,Double> obj2=new test<>();
        obj2.search(3.0,d);
        //For Character
        Character c[]={'a','b','c'};
        test<Character,Character> obj3=new test<>();
        obj3.search('b',c);
    }
    
}
class test<T,V>
{
    boolean flag=false;
  public <T,V>  void search(T s,V[] value)//generic method
    {
      for(int i=0;i<value.length;i++)
      {
          if(s.equals(value[i]))
          {
              flag=true;
              break;
          }
          else
              flag=false;
      }
        if(flag)
            System.out.println("Present in the given array");
        else
               System.out.println("Not Present in the given array");
    }
}
