package nep.timeline.freezer.core.scripts.api;

public interface EventInterfaceAPI {
    String getTag();

    default void onAfterFreeze(AppRecordAPI freezeContext, int foregroundType) {

    }
    default void onBeforeThaw(AppRecordAPI freezeContext, boolean temporary) {

    }
    default void onAfterThaw(AppRecordAPI freezeContext, boolean temporary) {

    }

    default boolean isIgnoreError() {
        return false;
    }
}
