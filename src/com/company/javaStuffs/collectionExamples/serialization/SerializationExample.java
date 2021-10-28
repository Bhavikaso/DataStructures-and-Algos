package com.company.javaStuffs.collectionExamples.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample  {

	public static void main(String args[]) throws Exception {
		Employee e = new Employee("Bhavika",null,"Soni");
		//serialize employee
		serialize(e);

		Employee eout = deserialize();
		System.out.println(e.toString());


	}

	//serialization code
	static void serialize(Employee e) throws Exception{
		try(FileOutputStream fs = new FileOutputStream("data.obj");
			ObjectOutputStream os = new ObjectOutputStream(fs))
		{
			os.writeObject(e);
		}
	}

	//Deserialization code
	static Employee deserialize()throws Exception{
		try(FileInputStream fis = new FileInputStream("data.obj");
			ObjectInputStream ois = new ObjectInputStream(fis))
		{
			return (Employee)(ois.readObject());
		}
	}
}
