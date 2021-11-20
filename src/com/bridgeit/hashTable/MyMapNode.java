package com.bridgeit.hashTable;

public class MyMapNode<K, V> implements Inode<K> {

	private K key;
	private V value;
	private Inode<K> next;

	public MyMapNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public K getKey() {

		return this.key;
	}

	@Override
	public void setKey(K key) {
		
		this.key = key;
	}

	@Override
	public void setNext(Inode<K> next) {
		
		this.next = next;

	}

	@Override
	public Inode<K> getNext() {
		return next;
	}

	@Override
	
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("MyNode{key=").append(key).append("}");
		if(next != null) {
			buffer.append("->").append(next);
		}
		return buffer.toString();
	}

}
