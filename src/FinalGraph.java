import java.awt.*;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMILE
 */

public class FinalGraph extends JFrame
{
    public FinalGraph() {
        super("");
 
        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);
 
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    private CategoryDataset createDataset() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    String series1 = "BandWidth";
    
    dataset.addValue(0.75, series1, "100");
    dataset.addValue(0.81, series1, "200");
    dataset.addValue(0.89, series1, "300");
    dataset.addValue(0.92, series1, "400");
    
    return dataset;
}
    private JPanel createChartPanel() 
    {
    String chartTitle = "Proposed Bandwidth Utilization";
    String categoryAxisLabel = "Cloudlet";
    String valueAxisLabel = "%";
 
    CategoryDataset dataset = createDataset();
 
    JFreeChart chart = ChartFactory.createLineChart(chartTitle,
            categoryAxisLabel, valueAxisLabel, dataset,PlotOrientation.VERTICAL,
                true,
                true,
                false );
 
    CategoryPlot plot = chart.getCategoryPlot();
    
    LineAndShapeRenderer renderer = new LineAndShapeRenderer();
 
// sets paint color for each series
renderer.setSeriesPaint(0, Color.RED);
 
// sets thickness for series (using strokes)
renderer.setSeriesStroke(0, new BasicStroke(4.0f));
 
plot.setRenderer(renderer);
    
    
    return new ChartPanel(chart);
}
     
}
