/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package es.orange.inventory;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RequestedItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8605333297986987136L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RequestedItem\",\"namespace\":\"es.orange.inventory\",\"fields\":[{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"user\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RequestedItem> ENCODER =
      new BinaryMessageEncoder<RequestedItem>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RequestedItem> DECODER =
      new BinaryMessageDecoder<RequestedItem>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RequestedItem> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RequestedItem> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RequestedItem> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RequestedItem>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RequestedItem to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RequestedItem from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RequestedItem instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RequestedItem fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence type;
  @Deprecated public java.lang.CharSequence user;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RequestedItem() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param user The new value for user
   */
  public RequestedItem(java.lang.CharSequence type, java.lang.CharSequence user) {
    this.type = type;
    this.user = user;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return user;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (java.lang.CharSequence)value$; break;
    case 1: user = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'user' field.
   * @return The value of the 'user' field.
   */
  public java.lang.CharSequence getUser() {
    return user;
  }


  /**
   * Sets the value of the 'user' field.
   * @param value the value to set.
   */
  public void setUser(java.lang.CharSequence value) {
    this.user = value;
  }

  /**
   * Creates a new RequestedItem RecordBuilder.
   * @return A new RequestedItem RecordBuilder
   */
  public static es.orange.inventory.RequestedItem.Builder newBuilder() {
    return new es.orange.inventory.RequestedItem.Builder();
  }

  /**
   * Creates a new RequestedItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RequestedItem RecordBuilder
   */
  public static es.orange.inventory.RequestedItem.Builder newBuilder(es.orange.inventory.RequestedItem.Builder other) {
    if (other == null) {
      return new es.orange.inventory.RequestedItem.Builder();
    } else {
      return new es.orange.inventory.RequestedItem.Builder(other);
    }
  }

  /**
   * Creates a new RequestedItem RecordBuilder by copying an existing RequestedItem instance.
   * @param other The existing instance to copy.
   * @return A new RequestedItem RecordBuilder
   */
  public static es.orange.inventory.RequestedItem.Builder newBuilder(es.orange.inventory.RequestedItem other) {
    if (other == null) {
      return new es.orange.inventory.RequestedItem.Builder();
    } else {
      return new es.orange.inventory.RequestedItem.Builder(other);
    }
  }

  /**
   * RecordBuilder for RequestedItem instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RequestedItem>
    implements org.apache.avro.data.RecordBuilder<RequestedItem> {

    private java.lang.CharSequence type;
    private java.lang.CharSequence user;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(es.orange.inventory.RequestedItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.user)) {
        this.user = data().deepCopy(fields()[1].schema(), other.user);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing RequestedItem instance
     * @param other The existing instance to copy.
     */
    private Builder(es.orange.inventory.RequestedItem other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.user)) {
        this.user = data().deepCopy(fields()[1].schema(), other.user);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public es.orange.inventory.RequestedItem.Builder setType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public es.orange.inventory.RequestedItem.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'user' field.
      * @return The value.
      */
    public java.lang.CharSequence getUser() {
      return user;
    }


    /**
      * Sets the value of the 'user' field.
      * @param value The value of 'user'.
      * @return This builder.
      */
    public es.orange.inventory.RequestedItem.Builder setUser(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.user = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'user' field has been set.
      * @return True if the 'user' field has been set, false otherwise.
      */
    public boolean hasUser() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'user' field.
      * @return This builder.
      */
    public es.orange.inventory.RequestedItem.Builder clearUser() {
      user = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RequestedItem build() {
      try {
        RequestedItem record = new RequestedItem();
        record.type = fieldSetFlags()[0] ? this.type : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.user = fieldSetFlags()[1] ? this.user : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RequestedItem>
    WRITER$ = (org.apache.avro.io.DatumWriter<RequestedItem>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RequestedItem>
    READER$ = (org.apache.avro.io.DatumReader<RequestedItem>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.type);

    out.writeString(this.user);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);

      this.user = in.readString(this.user instanceof Utf8 ? (Utf8)this.user : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.type = in.readString(this.type instanceof Utf8 ? (Utf8)this.type : null);
          break;

        case 1:
          this.user = in.readString(this.user instanceof Utf8 ? (Utf8)this.user : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









