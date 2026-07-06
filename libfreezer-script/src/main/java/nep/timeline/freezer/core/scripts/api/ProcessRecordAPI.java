package nep.timeline.freezer.core.scripts.api;

import android.content.pm.ApplicationInfo;

import nep.timeline.freezer.core.entity.ProcessRecord;

public record ProcessRecordAPI(ProcessRecord instance) {
    public String getPackageName() {
        throw new UnsupportedOperationException();
    }

    public String getProcessName() {
        throw new UnsupportedOperationException();
    }

    public String getProcessNameWithIsolated() {
        throw new UnsupportedOperationException();
    }

    public int getUserId() {
        throw new UnsupportedOperationException();
    }

    public int getUid() {
        throw new UnsupportedOperationException();
    }

    public int getRunningUid() {
        throw new UnsupportedOperationException();
    }

    public AppRecordAPI getAppRecord() {
        throw new UnsupportedOperationException();
    }

    public ApplicationInfo getApplicationInfo() {
        throw new UnsupportedOperationException();
    }
}
