/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrusion_detection_system_ma;

import classifier_package.fmeasure;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author jojoj
 */
public class Graph3 extends javax.swing.JFrame {

    /**
     * Creates new form Graph3
     */
    public Graph3() {
        super("Mean absolute error");
        final CategoryDataset dataset1 = createDataset1();
        final JFreeChart chart = ChartFactory.createBarChart(
            "Mean absolute error",        // chart title
            "",               // domain axis label
            "",                  // range axis label
            dataset1,                 // data
            PlotOrientation.VERTICAL,
            true,                     // include legend
            true,                     // tooltips?
            false                     // URL generator?  Not required...
        );
        
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(0xEE, 0xEE, 0xFF));
        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.DOWN_90);


        final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();
        renderer2.setToolTipGenerator(new StandardCategoryToolTipGenerator());
        plot.setRenderer(1, renderer2);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
        
        
        final ChartPanel chartPanel = new ChartPanel(chart);        
        add(chartPanel,BorderLayout.CENTER);
        chartPanel.setSize(800,670);
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private CategoryDataset createDataset1() {

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        try {
            final String series1 = "REP Tree";
            final String series2 = "Bagging";
            
            final String category1 = "REP Tree";
            final String category2 = "Bagging";
            
            
            
            
            fmeasure a=new fmeasure();
            double[] fmeasure_reptree=new double[39];
            fmeasure_reptree=a.fmeasure_reptree();
            
            double[] fmeasure_bagging=new double[39];
            fmeasure_bagging=a.fmeasure_bagging();
            
            double n1=0;
            double n2=0;
            
            String str0="";
            File f0 = new File("F:\\Project\\Intrusion_Detection_System_MA\\reptree.txt");
            BufferedReader in0 = new BufferedReader(new FileReader(f0));
            int i0=0;
            while ((str0 = in0.readLine()) != null) {
                
                if(str0.contains("Mean absolute error"))
                {
                    if(i0==1){
                    String[] txt=str0.split("\\ +");
                    n1=Double.parseDouble(txt[3]);
                    System.out.println("<br/>String1 "+txt[3]);
                    break; }
                    i0++;
                }
            }
            
            
            String str="";
            File f = new File("F:\\Project\\Intrusion_Detection_System_MA\\bagging.txt");
            BufferedReader in = new BufferedReader(new FileReader(f));
            int i=0;
            while ((str = in.readLine()) != null) {
                
                if(str.contains("Mean absolute error"))
                {
                    //if(i==1){
                    String[] txt=str.split("\\ +");
                    n2=Double.parseDouble(txt[3]);
                    System.out.println("<br/>String1 "+txt[3]);
                    break;
//                    }
//                    i++;
                }
            }
            
            dataset.addValue(n1, series1, category1);
            
            
            
            dataset.addValue(n2, series2, category2);
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Graph1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataset;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graph3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graph3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
