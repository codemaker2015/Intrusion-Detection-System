/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrusion_detection_system_ma;

import classifier_package.accuracy;
import classifier_package.precision;
import java.awt.BorderLayout;
import java.awt.Color;
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
public class Precision extends javax.swing.JFrame {

    /**
     * Creates new form Precision
     */
    public Precision() {
        super("Algorithm Precision Graph");
        final CategoryDataset dataset1 = createDataset1();
        final JFreeChart chart = ChartFactory.createBarChart(
            "Algorithm Precision Graph",        // chart title
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

        final String series1 = "REP Tree";
        final String series2 = "Bagging";

        final String category1 = "normal";
        final String category2 = "neptune";
        final String category3 = "warezclient";
        final String category4 = "ipsweep";
        final String category5 = "portsweep";
        final String category6 = "teardrop";
        final String category7 = "nmap";
        final String category8 = "satan";
        final String category9 = "smurf";
        final String category10 = "pod";
        final String category11 = "back";
        final String category12 = "guess_passwd";
        final String category13 = "portsweep3";
        final String category14 = "ipsweep4";
        final String category15 = "ftp_write";
        final String category16 = "multihop";
        final String category17 = "rootkit";
        final String category18 = "portsweep2";
        final String category19 = "portsweep0";
        final String category20 = "buffer_overflow";
        final String category21 = "buffer_overflow2";
        final String category22 = "imap";
        final String category23 = "warezmaster";
        final String category24 = "phf";
        final String category25 = "ipsweep1";
        final String category26 = "land";
        final String category27 = "portsweep1";
        final String category28 = "loadmodule2";
        final String category29 = "multihop3";
        final String category30 = "ipsweep3";
        final String category31 = "spy";
        final String category32 = "buffer_overflow1";
        final String category33 = "ipsweep2";
        final String category34 = "multihop1";
        final String category35 = "loadmodule4";
        final String category36 = "loadmodule";
        final String category37 = "perl";
        final String category38 = "ipsweep0";
        final String category39 = "loadmodule3";
 
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        precision a=new precision();
        double[] precision_reptree=new double[39];
        precision_reptree=a.precision_reptree();
        
        double[] precision_bagging=new double[39];
        precision_bagging=a.precision_bagging();
        
         dataset.addValue(precision_reptree[0], series1, category1);
         dataset.addValue(precision_reptree[1], series1, category2);
        dataset.addValue(precision_reptree[2], series1, category3);
        dataset.addValue(precision_reptree[3], series1, category4);
        dataset.addValue(precision_reptree[4], series1, category5);
        dataset.addValue(precision_reptree[5], series1, category6);
        dataset.addValue(precision_reptree[6], series1, category7);
        dataset.addValue(precision_reptree[7], series1, category8);
        dataset.addValue(precision_reptree[8], series1, category9);
        dataset.addValue(precision_reptree[9], series1, category10);
        dataset.addValue(precision_reptree[10], series1, category11);
        dataset.addValue(precision_reptree[11], series1, category12);
        dataset.addValue(precision_reptree[12], series1, category13);
        dataset.addValue(precision_reptree[13], series1, category14);
        dataset.addValue(precision_reptree[14], series1, category15);
        dataset.addValue(precision_reptree[15], series1, category16);
        dataset.addValue(precision_reptree[16], series1, category17);
        dataset.addValue(precision_reptree[17], series1, category18);
        dataset.addValue(precision_reptree[18], series1, category19);
        dataset.addValue(precision_reptree[19], series1, category20);
        dataset.addValue(precision_reptree[20], series1, category21);
        dataset.addValue(precision_reptree[21], series1, category22);
        dataset.addValue(precision_reptree[22], series1, category23);
        dataset.addValue(precision_reptree[23], series1, category24);
        dataset.addValue(precision_reptree[24], series1, category25);
        dataset.addValue(precision_reptree[25], series1, category26);
        dataset.addValue(precision_reptree[26], series1, category27);
        dataset.addValue(precision_reptree[27], series1, category28);
        dataset.addValue(precision_reptree[28], series1, category29);
        dataset.addValue(precision_reptree[29], series1, category30);
        dataset.addValue(precision_reptree[30], series1, category31);
        dataset.addValue(precision_reptree[31], series1, category32);
        dataset.addValue(precision_reptree[32], series1, category33);
        dataset.addValue(precision_reptree[33], series1, category34);
        dataset.addValue(precision_reptree[34], series1, category35);
        dataset.addValue(precision_reptree[35], series1, category36);
        dataset.addValue(precision_reptree[36], series1, category37);
        dataset.addValue(precision_reptree[37], series1, category38);
        dataset.addValue(precision_reptree[38], series1, category39);
        
        dataset.addValue(precision_bagging[0], series2, category1);
        dataset.addValue(precision_bagging[1], series2, category2);
        dataset.addValue(precision_bagging[2], series2, category3);
        dataset.addValue(precision_bagging[3], series2, category4);
        dataset.addValue(precision_bagging[4], series2, category5);
        dataset.addValue(precision_bagging[5], series2, category6);
        dataset.addValue(precision_bagging[6], series2, category7);
        dataset.addValue(precision_bagging[7], series2, category8);
        dataset.addValue(precision_bagging[8], series2, category9);
        dataset.addValue(precision_bagging[9], series2, category10);
        dataset.addValue(precision_bagging[10], series2, category11);
        dataset.addValue(precision_bagging[11], series2, category12);
        dataset.addValue(precision_bagging[12], series2, category13);
        dataset.addValue(precision_bagging[13], series2, category14);
        dataset.addValue(precision_bagging[14], series2, category15);
        dataset.addValue(precision_bagging[15], series2, category16);
        dataset.addValue(precision_bagging[16], series2, category17);
        dataset.addValue(precision_bagging[17], series2, category18);
        dataset.addValue(precision_bagging[18], series2, category19);
        dataset.addValue(precision_bagging[19], series2, category20);
        dataset.addValue(precision_bagging[20], series2, category21);
        dataset.addValue(precision_bagging[21], series2, category22);
        dataset.addValue(precision_bagging[22], series2, category23);
        dataset.addValue(precision_bagging[23], series2, category24);
        dataset.addValue(precision_bagging[24], series2, category25);
        dataset.addValue(precision_bagging[25], series2, category26);
        dataset.addValue(precision_bagging[26], series2, category27);
        dataset.addValue(precision_bagging[27], series2, category28);
        dataset.addValue(precision_bagging[28], series2, category29);
        dataset.addValue(precision_bagging[29], series2, category30);
        dataset.addValue(precision_bagging[30], series2, category31);
        dataset.addValue(precision_bagging[31], series2, category32);
        dataset.addValue(precision_bagging[32], series2, category33);
        dataset.addValue(precision_bagging[33], series2, category34);
        dataset.addValue(precision_bagging[34], series2, category35);
        dataset.addValue(precision_bagging[35], series2, category36);
        dataset.addValue(precision_bagging[36], series2, category37);
        dataset.addValue(precision_bagging[37], series2, category38);
        dataset.addValue(precision_bagging[38], series2, category39);
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 700));
        setMinimumSize(new java.awt.Dimension(800, 700));

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
            java.util.logging.Logger.getLogger(Precision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Precision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Precision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Precision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Precision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
