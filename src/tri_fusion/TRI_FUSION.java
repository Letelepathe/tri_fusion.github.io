/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tri_fusion;
import java.util.Date;
 import java.util.LinkedList; 
import java.util.List; 
import java.util.ListIterator;
import java.util.Scanner;
 
/**
 *
 * @author lecryptologue
 */
public class TRI_FUSION {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
         Date d_deb=new Date();
        long t_deb=d_deb.getTime(),t_fin;
        Scanner lire =new Scanner(System.in);
        int taille,i;
        System.out.println("Tapez la taille du tableau");
        taille=lire.nextInt();
        int tab[]=new int[taille];
        System.out.println("REMPLISSEZ LE TABLEAU");
        for(i=0;i<taille;i++)
        {
             System.out.println("ENTREZ LELEMENT NUM "+i);
             tab[i]=lire.nextInt();
        }
        
        Fusion_(tab,taille);
         Date d_fin=new Date();
        t_fin=d_fin.getTime();
        System.out.print("\nle temps debut "+t_deb+" et le temps fin"+t_fin+" le temps d'execution vaut: "+(t_fin-t_deb)+"ms");
    }
       static void Fusion_(int tab[],int taille)
    {
        
        if(taille>1)
        {
             int t1,t2,i;
        /*t1=(int)taille/2;
        t2=taille-t1;
        */
           
        t1=(int)tab.length/2;
        t2=tab.length-t1;
        int tab1[]=new int[t1];
        int tab2[]=new int[t2];
        System.out.println("tableau initial");
        System.out.println(" deuxieme parti"+t2+" premiere parti"+t1);
         for(i=0;i<t1;i++)
        {
            System.out.println(tab[0]);
        }
             
        for(i=0;i<t1;i++)
        {
            tab1[i]=tab[i];
             
        }
        for(i=0,t2=taille-t1;i<taille && t2<taille;i++,t2++)
        {
            tab2[i]=tab[t2];
        }
         //trie des tableaux segmentés
         int inter;
         i=0;
         while(i<tab1.length-1)
         {
             if(tab1[i]>tab1[i+1])
             {
                 inter=tab1[i];
                 tab1[i]=tab1[i+1];
                 tab1[i+1]=inter;
             }
             i++;
         }
         i=0;
        while(i<tab2.length-1)
         {
             if(tab2[i]>tab2[i+1])
             {
                 inter=tab2[i];
                 tab2[i]=tab2[i+1];
                 tab2[i+1]=inter;
             }
             i++;
         }
           for(i=0,t2=taille-t1;t2<taille;i++,t2++)
            {
              System.out.print("Tableau2 Trie "+tab2[i]+"\n");
            }
            for(i=0,t2=taille-t1;t2<taille;i++,t2++)
            {
              System.out.print("Tableau1 Trié "+tab1[i]);
            }
            Fusion_(tab1,tab1.length);
            Fusion_(tab2,tab2.length);
            fusion(tab1);
            fusion(tab2);
            
            
        }
        
    }
       static void fusion(int tab[])
       {
           if(tab.length>=1)
           {
               List l = new LinkedList();
                for(int i=0;i<tab.length;i++)
                {
                    l.add(tab[i]);
                }
                for(int i=0;i<l.size();i++)
                {
                    System.out.print("|"+l.get(i)+"|");
                }
           }
           
           
       }
       
       
       
}

     
