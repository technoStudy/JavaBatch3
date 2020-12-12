package technoStudy.Day53.Generics.GenericClass;

public class GenericHolder<HolderClass> {
    private HolderClass storage;

    public HolderClass getStorage() {
        return storage;
    }

    public void setStorage(HolderClass storage) {
        this.storage = storage;
    }
}
