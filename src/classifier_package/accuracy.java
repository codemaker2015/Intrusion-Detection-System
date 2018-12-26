/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classifier_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jojoj
 */
public class accuracy {
    public double[] accuracy_reptree()
    {
        double[] accuracy=new double[39];
        BufferedReader in=null;
        try {
            File f = new File("F:\\Project\\Intrusion_Detection_System_MA\\reptree.txt");
            in = new BufferedReader(new FileReader(f));
            int i=0;
            int j=0;
            String str;
            int[][] confusion=new int[39][39];
            while ((str = in.readLine()) != null) {
                if(i>774 && str.split(" ").length>2)
                {
                    str=str.replaceAll("\\s+", " ");
                    String[] sp=str.split(" ");
                    System.out.println(str);
                    System.out.println("0 "+sp[1]+"  1 "+sp[2]+"  2 "+sp[3]+"  3 "+sp[4]+"  4 "+sp[5]);
                    confusion[j][0]=Integer.parseInt(sp[1]);
                    confusion[j][1]=Integer.parseInt(sp[2]);
                    confusion[j][2]=Integer.parseInt(sp[3]);
                    confusion[j][3]=Integer.parseInt(sp[4]);
                    confusion[j][4]=Integer.parseInt(sp[5]);
                    confusion[j][5]=Integer.parseInt(sp[6]);
                    confusion[j][6]=Integer.parseInt(sp[7]);
                    confusion[j][7]=Integer.parseInt(sp[8]);
                    confusion[j][8]=Integer.parseInt(sp[9]);
                    confusion[j][9]=Integer.parseInt(sp[10]);
                    confusion[j][10]=Integer.parseInt(sp[11]);
                    confusion[j][11]=Integer.parseInt(sp[12]);
                    confusion[j][12]=Integer.parseInt(sp[13]);
                    confusion[j][13]=Integer.parseInt(sp[14]);
                    confusion[j][14]=Integer.parseInt(sp[15]);
                    confusion[j][15]=Integer.parseInt(sp[16]);
                    confusion[j][16]=Integer.parseInt(sp[17]);
                    confusion[j][17]=Integer.parseInt(sp[18]);
                    confusion[j][18]=Integer.parseInt(sp[19]);
                    confusion[j][19]=Integer.parseInt(sp[20]);
                    confusion[j][20]=Integer.parseInt(sp[21]);
                    confusion[j][21]=Integer.parseInt(sp[22]);
                    confusion[j][22]=Integer.parseInt(sp[23]);
                    confusion[j][23]=Integer.parseInt(sp[24]);
                    confusion[j][24]=Integer.parseInt(sp[25]);
                    confusion[j][25]=Integer.parseInt(sp[26]);
                    confusion[j][26]=Integer.parseInt(sp[27]);
                    confusion[j][27]=Integer.parseInt(sp[28]);
                    confusion[j][28]=Integer.parseInt(sp[29]);
                    confusion[j][29]=Integer.parseInt(sp[30]);
                    confusion[j][30]=Integer.parseInt(sp[31]);
                    confusion[j][31]=Integer.parseInt(sp[32]);
                    confusion[j][32]=Integer.parseInt(sp[33]);
                    confusion[j][33]=Integer.parseInt(sp[34]);
                    confusion[j][34]=Integer.parseInt(sp[35]);
                    confusion[j][35]=Integer.parseInt(sp[36]);
                    confusion[j][36]=Integer.parseInt(sp[37]);
                    confusion[j][37]=Integer.parseInt(sp[38]);
                    confusion[j][38]=Integer.parseInt(sp[39]);
                  
                    j++;
                }
                i++;
                if(i==815)
                    break;
            }   
            int[] col_sum=new int[39];
            for(i=0;i<39;i++)
            {
                int sum=0;
                for(j=0;j<39;j++)
                {
                    sum+=confusion[j][i];
                }
                col_sum[i]=sum;
            }
            int[] row_sum=new int[39];
            for(i=0;i<39;i++)
            {
                int sum=0;
                for(j=0;j<39;j++)
                {
                    sum+=confusion[i][j];
                }
                row_sum[i]=sum;
            }
            
            for(i=0;i<39;i++)
            {
                for(j=0;j<39;j++)
                {
                    if(i==j)
                    {
                        accuracy[i]=(double)confusion[i][i]/(double)row_sum[i]+(double)col_sum[i];
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(accuracy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(accuracy.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(accuracy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return accuracy;
    }
    
    public double[] accuracy_bagging()
    {
        double[] accuracy=new double[39];
        BufferedReader in=null;
        try {
            File f = new File("F:\\Project\\Intrusion_Detection_System_MA\\bagging.txt");
            in = new BufferedReader(new FileReader(f));
            int i=0;
            int j=0;
            String str;
            int[][] confusion=new int[39][39];
            while ((str = in.readLine()) != null) {
                if(i>7234 && str.split(" ").length>2)
                {
                    str=str.replaceAll("\\s+", " ");
                    String[] sp=str.split(" ");
                    confusion[j][0]=Integer.parseInt(sp[1]);
                    confusion[j][1]=Integer.parseInt(sp[2]);
                    confusion[j][2]=Integer.parseInt(sp[3]);
                    confusion[j][3]=Integer.parseInt(sp[4]);
                    confusion[j][4]=Integer.parseInt(sp[5]);
                    confusion[j][5]=Integer.parseInt(sp[6]);
                    confusion[j][6]=Integer.parseInt(sp[7]);
                    confusion[j][7]=Integer.parseInt(sp[8]);
                    confusion[j][8]=Integer.parseInt(sp[9]);
                    confusion[j][9]=Integer.parseInt(sp[10]);
                    confusion[j][10]=Integer.parseInt(sp[11]);
                    confusion[j][11]=Integer.parseInt(sp[12]);
                    confusion[j][12]=Integer.parseInt(sp[13]);
                    confusion[j][13]=Integer.parseInt(sp[14]);
                    confusion[j][14]=Integer.parseInt(sp[15]);
                    confusion[j][15]=Integer.parseInt(sp[16]);
                    confusion[j][16]=Integer.parseInt(sp[17]);
                    confusion[j][17]=Integer.parseInt(sp[18]);
                    confusion[j][18]=Integer.parseInt(sp[19]);
                    confusion[j][19]=Integer.parseInt(sp[20]);
                    confusion[j][20]=Integer.parseInt(sp[21]);
                    confusion[j][21]=Integer.parseInt(sp[22]);
                    confusion[j][22]=Integer.parseInt(sp[23]);
                    confusion[j][23]=Integer.parseInt(sp[24]);
                    confusion[j][24]=Integer.parseInt(sp[25]);
                    confusion[j][25]=Integer.parseInt(sp[26]);
                    confusion[j][26]=Integer.parseInt(sp[27]);
                    confusion[j][27]=Integer.parseInt(sp[28]);
                    confusion[j][28]=Integer.parseInt(sp[29]);
                    confusion[j][29]=Integer.parseInt(sp[30]);
                    confusion[j][30]=Integer.parseInt(sp[31]);
                    confusion[j][31]=Integer.parseInt(sp[32]);
                    confusion[j][32]=Integer.parseInt(sp[33]);
                    confusion[j][33]=Integer.parseInt(sp[34]);
                    confusion[j][34]=Integer.parseInt(sp[35]);
                    confusion[j][35]=Integer.parseInt(sp[36]);
                    confusion[j][36]=Integer.parseInt(sp[37]);
                    confusion[j][37]=Integer.parseInt(sp[38]);
                    confusion[j][38]=Integer.parseInt(sp[39]);
                  
                    j++;
                }
                i++;
                if(i==7275)
                    break;
            }   
            int[] col_sum=new int[39];
            for(i=0;i<39;i++)
            {
                int sum=0;
                for(j=0;j<39;j++)
                {
                    sum+=confusion[j][i];
                }
                col_sum[i]=sum;
            }
            int[] row_sum=new int[39];
            for(i=0;i<39;i++)
            {
                int sum=0;
                for(j=0;j<39;j++)
                {
                    sum+=confusion[i][j];
                }
                row_sum[i]=sum;
            }
            
            for(i=0;i<39;i++)
            {
                for(j=0;j<39;j++)
                {
                    if(i==j)
                    {
                        accuracy[i]=(double)confusion[i][i]/(double)row_sum[i]+(double)col_sum[i];
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(accuracy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(accuracy.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(accuracy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return accuracy;
    }
}
