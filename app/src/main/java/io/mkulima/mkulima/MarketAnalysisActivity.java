package io.mkulima.mkulima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MarketAnalysisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_analysis);
        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1200),
                new DataPoint(1, 1450),
                new DataPoint(2, 1143),
                new DataPoint(3, 1600),
                new DataPoint(4, 1870),
                new DataPoint(5, 1900),
                new DataPoint(6, 1650),
                new DataPoint(7, 100)
        });
        graph.addSeries(series);
    }
}
