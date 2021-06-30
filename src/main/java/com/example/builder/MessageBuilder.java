package com.example.builder;

import java.util.ArrayList;
import java.util.List;

import com.example.message.Field;
import com.example.message.Message;
import com.example.message.Payload;
import com.example.message.Schema;

public class MessageBuilder {

	public static Message build() {
		
		Message message = new Message();

		Schema schema = new Schema();
		schema.setType("struct");
		schema.setOptional(false);
		schema.setName("net.superbid.SysRec");

		List<Field> fields = new ArrayList<Field>();
		fields.add(new Field("firstName", "string", false));
		fields.add(new Field("lastName", "string", false));

		schema.setFields(fields);

		Payload payload = new Payload();
		payload.setFirstName("Carlos");
		payload.setLastName("Maciel");

		message.setSchema(schema);
		message.setPayload(payload);

		return message;

	}

}
