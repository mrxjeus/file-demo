package com.quangnv.filedemo.presenter;

import com.quangnv.filedemo.model.ImageUtil;
import com.quangnv.filedemo.view.MainView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PresenterImpl implements Presenter {

    private MainView mMainView;
    private File mFile;

    public PresenterImpl(File file, MainView mainView) {
        mMainView = mainView;
        mFile = file;
    }

    @Override
    public void loadImage() {
        List<String> files = new ArrayList<>();
        ImageUtil.loadAllImage(mFile, files);

        mMainView.showImage(files);
    }
}
