package com.anupras.apl.anamika_test.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/anupras/apl/anamika_test/service/OpenWeatherApiService;", "", "getCurrentWeather", "Lkotlinx/coroutines/Deferred;", "Lcom/anupras/apl/anamika_test/data/currentweatherresponse/CurrentWeatherResponse;", "location", "", "units", "getFutureWeather", "Lcom/anupras/apl/anamika_test/data/FutureWeatherResponse;", "cnt", "Companion", "app_debug"})
public abstract interface OpenWeatherApiService {
    public static final com.anupras.apl.anamika_test.service.OpenWeatherApiService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract kotlinx.coroutines.Deferred<com.anupras.apl.anamika_test.data.currentweatherresponse.CurrentWeatherResponse> getCurrentWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast/daily")
    public abstract kotlinx.coroutines.Deferred<com.anupras.apl.anamika_test.data.FutureWeatherResponse> getFutureWeather(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "units")
    java.lang.String units, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "cnt")
    java.lang.String cnt);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/anupras/apl/anamika_test/service/OpenWeatherApiService$Companion;", "", "()V", "invoke", "Lcom/anupras/apl/anamika_test/service/OpenWeatherApiService;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.anupras.apl.anamika_test.service.OpenWeatherApiService invoke() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}