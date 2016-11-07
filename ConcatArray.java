package com.bharadwaj.example.maps;

public class ConcatArray {

	public static void main(String[]args){

		  char[] a = {'a', 'b', 'c'};
		  char[] b = {'d', 'e', 'f'};
		  char[] c = merge(a,b);
		  for(int i=0; i<c.length; i++)
		  System.out.print(c[i]+" ");
		}
		public static char[]merge(char[]a, char[]b){
		  char []c = new char[a.length+b.length];
		  int i;
		  for(i=0; i<a.length; i++)
		     c[i] = a[i];

		     for(int j=0; j<b.length; j++)
		        c[i++]=b[j];
		        return c;
		}
}
