package app.ewtc.masterung.testpdfview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class MainActivity extends AppCompatActivity implements OnPageChangeListener, OnLoadCompleteListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create PDF View
        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("TutorialAndroid.pdf")
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(MainActivity.this)
                .onLoad(MainActivity.this)
                .scrollHandle(new DefaultScrollHandle(MainActivity.this))
                .load();
        
    }   // Main Method

    @Override
    public void onPageChanged(int page, int pageCount) {

    }

    @Override
    public void loadComplete(int nbPages) {

    }
}   // Main Class
