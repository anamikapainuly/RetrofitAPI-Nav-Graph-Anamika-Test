package com.anupras.apl.anamika_test.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/anupras/apl/anamika_test/adapter/ForecastsWeatherAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/anupras/apl/anamika_test/adapter/ForecastsWeatherAdapter$ForecastViewHolder;", "dataList", "Ljava/util/ArrayList;", "Lcom/anupras/apl/anamika_test/data/ForecastDetail;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ForecastViewHolder", "app_debug"})
public final class ForecastsWeatherAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.anupras.apl.anamika_test.adapter.ForecastsWeatherAdapter.ForecastViewHolder> {
    private final java.util.ArrayList<com.anupras.apl.anamika_test.data.ForecastDetail> dataList = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.anupras.apl.anamika_test.adapter.ForecastsWeatherAdapter.ForecastViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.anupras.apl.anamika_test.adapter.ForecastsWeatherAdapter.ForecastViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ForecastsWeatherAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.anupras.apl.anamika_test.data.ForecastDetail> dataList, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J8\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002\u00a8\u0006\u0015"}, d2 = {"Lcom/anupras/apl/anamika_test/adapter/ForecastsWeatherAdapter$ForecastViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "forecastElement", "Lcom/anupras/apl/anamika_test/data/ForecastDetail;", "getData", "", "dt", "", "getDay", "showWeatherDetail", "date", "descriptionVar", "temperatureVar", "imageUrlVar", "temMinMax", "view", "app_debug"})
    public static final class ForecastViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.anupras.apl.anamika_test.data.ForecastDetail forecastElement) {
        }
        
        private final void showWeatherDetail(java.lang.String date, java.lang.String descriptionVar, java.lang.String temperatureVar, java.lang.String imageUrlVar, java.lang.String temMinMax, android.view.View view) {
        }
        
        private final java.lang.String getData(long dt) {
            return null;
        }
        
        private final java.lang.String getDay(long dt) {
            return null;
        }
        
        public ForecastViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}