package com.anupras.apl.anamika_test.ui.weather.future.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0012\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/anupras/apl/anamika_test/ui/weather/future/list/FutureListWeatherFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dataList", "Ljava/util/ArrayList;", "Lcom/anupras/apl/anamika_test/data/ForecastDetail;", "getDataList", "()Ljava/util/ArrayList;", "setDataList", "(Ljava/util/ArrayList;)V", "myAdapter", "Lcom/anupras/apl/anamika_test/adapter/ForecastsWeatherAdapter;", "getMyAdapter", "()Lcom/anupras/apl/anamika_test/adapter/ForecastsWeatherAdapter;", "setMyAdapter", "(Lcom/anupras/apl/anamika_test/adapter/ForecastsWeatherAdapter;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "viewModel", "Lcom/anupras/apl/anamika_test/ui/weather/future/list/FutureListWeatherViewModel;", "initView", "", "initializeRecyclerView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
public final class FutureListWeatherFragment extends androidx.fragment.app.Fragment {
    private com.anupras.apl.anamika_test.ui.weather.future.list.FutureListWeatherViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    protected android.view.View rootView;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.anupras.apl.anamika_test.data.ForecastDetail> dataList;
    @org.jetbrains.annotations.Nullable()
    private com.anupras.apl.anamika_test.adapter.ForecastsWeatherAdapter myAdapter;
    public static final com.anupras.apl.anamika_test.ui.weather.future.list.FutureListWeatherFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final android.view.View getRootView() {
        return null;
    }
    
    protected final void setRootView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.anupras.apl.anamika_test.data.ForecastDetail> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.anupras.apl.anamika_test.data.ForecastDetail> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.anupras.apl.anamika_test.adapter.ForecastsWeatherAdapter getMyAdapter() {
        return null;
    }
    
    public final void setMyAdapter(@org.jetbrains.annotations.Nullable()
    com.anupras.apl.anamika_test.adapter.ForecastsWeatherAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initView() {
    }
    
    private final void initializeRecyclerView() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public FutureListWeatherFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/anupras/apl/anamika_test/ui/weather/future/list/FutureListWeatherFragment$Companion;", "", "()V", "newInstance", "Lcom/anupras/apl/anamika_test/ui/weather/future/list/FutureListWeatherFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.anupras.apl.anamika_test.ui.weather.future.list.FutureListWeatherFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}