package com.anupras.apl.anamika_test.ui.weather.future.detail;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FutureDetailWeatherFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private FutureDetailWeatherFragmentArgs() {
  }

  private FutureDetailWeatherFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FutureDetailWeatherFragmentArgs fromBundle(@NonNull Bundle bundle) {
    FutureDetailWeatherFragmentArgs __result = new FutureDetailWeatherFragmentArgs();
    bundle.setClassLoader(FutureDetailWeatherFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("day")) {
      String day;
      day = bundle.getString("day");
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("day", day);
    } else {
      throw new IllegalArgumentException("Required argument \"day\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("description")) {
      String description;
      description = bundle.getString("description");
      if (description == null) {
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("description", description);
    } else {
      throw new IllegalArgumentException("Required argument \"description\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("temp")) {
      String temp;
      temp = bundle.getString("temp");
      if (temp == null) {
        throw new IllegalArgumentException("Argument \"temp\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("temp", temp);
    } else {
      throw new IllegalArgumentException("Required argument \"temp\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("icon")) {
      String icon;
      icon = bundle.getString("icon");
      if (icon == null) {
        throw new IllegalArgumentException("Argument \"icon\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("icon", icon);
    } else {
      throw new IllegalArgumentException("Required argument \"icon\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("tempMinMax")) {
      String tempMinMax;
      tempMinMax = bundle.getString("tempMinMax");
      if (tempMinMax == null) {
        throw new IllegalArgumentException("Argument \"tempMinMax\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("tempMinMax", tempMinMax);
    } else {
      throw new IllegalArgumentException("Required argument \"tempMinMax\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getDay() {
    return (String) arguments.get("day");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getDescription() {
    return (String) arguments.get("description");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTemp() {
    return (String) arguments.get("temp");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getIcon() {
    return (String) arguments.get("icon");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTempMinMax() {
    return (String) arguments.get("tempMinMax");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("day")) {
      String day = (String) arguments.get("day");
      __result.putString("day", day);
    }
    if (arguments.containsKey("description")) {
      String description = (String) arguments.get("description");
      __result.putString("description", description);
    }
    if (arguments.containsKey("temp")) {
      String temp = (String) arguments.get("temp");
      __result.putString("temp", temp);
    }
    if (arguments.containsKey("icon")) {
      String icon = (String) arguments.get("icon");
      __result.putString("icon", icon);
    }
    if (arguments.containsKey("tempMinMax")) {
      String tempMinMax = (String) arguments.get("tempMinMax");
      __result.putString("tempMinMax", tempMinMax);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    FutureDetailWeatherFragmentArgs that = (FutureDetailWeatherFragmentArgs) object;
    if (arguments.containsKey("day") != that.arguments.containsKey("day")) {
      return false;
    }
    if (getDay() != null ? !getDay().equals(that.getDay()) : that.getDay() != null) {
      return false;
    }
    if (arguments.containsKey("description") != that.arguments.containsKey("description")) {
      return false;
    }
    if (getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null) {
      return false;
    }
    if (arguments.containsKey("temp") != that.arguments.containsKey("temp")) {
      return false;
    }
    if (getTemp() != null ? !getTemp().equals(that.getTemp()) : that.getTemp() != null) {
      return false;
    }
    if (arguments.containsKey("icon") != that.arguments.containsKey("icon")) {
      return false;
    }
    if (getIcon() != null ? !getIcon().equals(that.getIcon()) : that.getIcon() != null) {
      return false;
    }
    if (arguments.containsKey("tempMinMax") != that.arguments.containsKey("tempMinMax")) {
      return false;
    }
    if (getTempMinMax() != null ? !getTempMinMax().equals(that.getTempMinMax()) : that.getTempMinMax() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getDay() != null ? getDay().hashCode() : 0);
    result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
    result = 31 * result + (getTemp() != null ? getTemp().hashCode() : 0);
    result = 31 * result + (getIcon() != null ? getIcon().hashCode() : 0);
    result = 31 * result + (getTempMinMax() != null ? getTempMinMax().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "FutureDetailWeatherFragmentArgs{"
        + "day=" + getDay()
        + ", description=" + getDescription()
        + ", temp=" + getTemp()
        + ", icon=" + getIcon()
        + ", tempMinMax=" + getTempMinMax()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(FutureDetailWeatherFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String day, @NonNull String description, @NonNull String temp,
        @NonNull String icon, @NonNull String tempMinMax) {
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      if (description == null) {
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("description", description);
      if (temp == null) {
        throw new IllegalArgumentException("Argument \"temp\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("temp", temp);
      if (icon == null) {
        throw new IllegalArgumentException("Argument \"icon\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("icon", icon);
      if (tempMinMax == null) {
        throw new IllegalArgumentException("Argument \"tempMinMax\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tempMinMax", tempMinMax);
    }

    @NonNull
    public FutureDetailWeatherFragmentArgs build() {
      FutureDetailWeatherFragmentArgs result = new FutureDetailWeatherFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setDay(@NonNull String day) {
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      return this;
    }

    @NonNull
    public Builder setDescription(@NonNull String description) {
      if (description == null) {
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("description", description);
      return this;
    }

    @NonNull
    public Builder setTemp(@NonNull String temp) {
      if (temp == null) {
        throw new IllegalArgumentException("Argument \"temp\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("temp", temp);
      return this;
    }

    @NonNull
    public Builder setIcon(@NonNull String icon) {
      if (icon == null) {
        throw new IllegalArgumentException("Argument \"icon\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("icon", icon);
      return this;
    }

    @NonNull
    public Builder setTempMinMax(@NonNull String tempMinMax) {
      if (tempMinMax == null) {
        throw new IllegalArgumentException("Argument \"tempMinMax\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tempMinMax", tempMinMax);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getDay() {
      return (String) arguments.get("day");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getDescription() {
      return (String) arguments.get("description");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTemp() {
      return (String) arguments.get("temp");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getIcon() {
      return (String) arguments.get("icon");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTempMinMax() {
      return (String) arguments.get("tempMinMax");
    }
  }
}
