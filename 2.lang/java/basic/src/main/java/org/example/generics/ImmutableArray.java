package org.example.generics;


public record ImmutableArray<T>(T[] items) {

    public ImmutableArray(T[] items) {
        this.items = items.clone();
    }

    @SafeVarargs
    static <E> ImmutableArray<E> of(E... items) {
        return new ImmutableArray<>(items);
    }

    public T get(int index) {
        return this.items[index];
    }

    public int length() {
        return items.length;
    }
}
