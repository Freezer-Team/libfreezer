package nep.timeline.freezer.core.scripts.api;

import android.content.pm.ApplicationInfo;

import nep.timeline.freezer.core.entity.AppRecord;

public record AppRecordAPI(AppRecord instance) {
    public String getPackageName() {
        throw new UnsupportedOperationException();
    }

    public int getUserId() {
        throw new UnsupportedOperationException();
    }

    public int getUid() {
        throw new UnsupportedOperationException();
    }

    public ApplicationInfo getApplicationInfo() {
        throw new UnsupportedOperationException();
    }
}
