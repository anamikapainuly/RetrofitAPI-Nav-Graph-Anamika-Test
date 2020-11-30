package com.anupras.apl.anamika_test.ui.weather.future.list;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.anupras.apl.anamika_test.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FutureListWeatherFragmentDirections {
  private FutureListWeatherFragmentDirections() {
  }

  @NonNull
  public static ActionDetail actionDetail(@NonNull String day, @NonNull String description,
      @NonNull String temp, @NonNull String icon, @NonNull String tempMinMax) {
    return new ActionDetail(day, description, temp, icon, tempMinMax);
  }

  public static class ActionDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDetail(@NonNull String day, @NonNull String description, @NonNull String temp,
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
    public ActionDetail setDay(@NonNull String day) {
      if (day == null) {
        throw new IllegalArgumentException("Argument \"day\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("day", day);
      return this;
    }

    @NonNull
    public ActionDetail setDescription(@NonNull String description) {
      if (description == null) {
        throw new IllegalArgumentException("Argument \"description\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("description", description);
      return this;
    }

    @NonNull
    public ActionDetail setTemp(@NonNull String temp) {
      if (temp == null) {
        throw new IllegalArgumentException("Argument \"temp\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("temp", temp);
      return this;
    }

    @NonNull
    public ActionDetail setIcon(@NonNull String icon) {
      if (icon == null) {
        throw new IllegalArgumentException("Argument \"icon\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("icon", icon);
      return this;
    }

    @NonNull
    public ActionDetail setTempMinMax(@NonNull String tempMinMax) {
      if (tempMinMax == null) {
        throw new IllegalArgumentException("Argument \"tempMinMax\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("tempMinMax", tempMinMax);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.actionDetail;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDetail that = (ActionDetail) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDetail(actionId=" + getActionId() + "){"
          + "day=" + getDay()
          + ", description=" + getDescription()
          + ", temp=" + getTemp()
          + ", icon=" + getIcon()
          + ", tempMinMax=" + getTempMinMax()
          + "}";
    }
  }
}
