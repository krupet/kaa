/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.appenders.cassandra.config.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class ColumnMappingElement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ColumnMappingElement\",\"namespace\":\"org.kaaproject.kaa.server.appenders.cassandra.config.gen\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"ColumnMappingElementType\",\"symbols\":[\"HEADER_FIELD\",\"EVENT_FIELD\",\"HEADER_JSON\",\"EVENT_JSON\",\"HEADER_BINARY\",\"EVENT_BINARY\",\"UUID\"]},\"displayName\":\"Type\",\"weight\":0.2,\"by_default\":\"HEADER\"},{\"name\":\"value\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Value\",\"weight\":0.2,\"by_default\":\"applicationToken\"},{\"name\":\"columnName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"displayName\":\"Name\",\"weight\":0.2,\"by_default\":\"application_token\"},{\"name\":\"columnType\",\"type\":{\"type\":\"enum\",\"name\":\"ColumnType\",\"symbols\":[\"BIGINT\",\"BLOB\",\"BOOLEAN\",\"DOUBLE\",\"FLOAT\",\"INT\",\"TEXT\",\"UUID\"]},\"displayName\":\"Column Type\",\"weight\":0.2,\"by_default\":\"BOOLEAN\"},{\"name\":\"partitionKey\",\"type\":\"boolean\",\"displayName\":\"Is part of partition key?\",\"weight\":0.1,\"by_default\":false},{\"name\":\"clusteringKey\",\"type\":\"boolean\",\"displayName\":\"Is part of clustering key?\",\"weight\":0.1,\"by_default\":false}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType type;
   private java.lang.String value;
   private java.lang.String columnName;
   private org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType columnType;
   private boolean partitionKey;
   private boolean clusteringKey;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public ColumnMappingElement() {}

  /**
   * All-args constructor.
   */
  public ColumnMappingElement(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType type, java.lang.String value, java.lang.String columnName, org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType columnType, java.lang.Boolean partitionKey, java.lang.Boolean clusteringKey) {
    this.type = type;
    this.value = value;
    this.columnName = columnName;
    this.columnType = columnType;
    this.partitionKey = partitionKey;
    this.clusteringKey = clusteringKey;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return value;
    case 2: return columnName;
    case 3: return columnType;
    case 4: return partitionKey;
    case 5: return clusteringKey;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType)value$; break;
    case 1: value = (java.lang.String)value$; break;
    case 2: columnName = (java.lang.String)value$; break;
    case 3: columnType = (org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType)value$; break;
    case 4: partitionKey = (java.lang.Boolean)value$; break;
    case 5: clusteringKey = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   */
  public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.String value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'columnName' field.
   */
  public java.lang.String getColumnName() {
    return columnName;
  }

  /**
   * Sets the value of the 'columnName' field.
   * @param value the value to set.
   */
  public void setColumnName(java.lang.String value) {
    this.columnName = value;
  }

  /**
   * Gets the value of the 'columnType' field.
   */
  public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType getColumnType() {
    return columnType;
  }

  /**
   * Sets the value of the 'columnType' field.
   * @param value the value to set.
   */
  public void setColumnType(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType value) {
    this.columnType = value;
  }

  /**
   * Gets the value of the 'partitionKey' field.
   */
  public java.lang.Boolean getPartitionKey() {
    return partitionKey;
  }

  /**
   * Sets the value of the 'partitionKey' field.
   * @param value the value to set.
   */
  public void setPartitionKey(java.lang.Boolean value) {
    this.partitionKey = value;
  }

  /**
   * Gets the value of the 'clusteringKey' field.
   */
  public java.lang.Boolean getClusteringKey() {
    return clusteringKey;
  }

  /**
   * Sets the value of the 'clusteringKey' field.
   * @param value the value to set.
   */
  public void setClusteringKey(java.lang.Boolean value) {
    this.clusteringKey = value;
  }

  /** Creates a new ColumnMappingElement RecordBuilder */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder newBuilder() {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder();
  }
  
  /** Creates a new ColumnMappingElement RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder newBuilder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder other) {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder(other);
  }
  
  /** Creates a new ColumnMappingElement RecordBuilder by copying an existing ColumnMappingElement instance */
  public static org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder newBuilder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement other) {
    return new org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder(other);
  }
  
  /**
   * RecordBuilder for ColumnMappingElement instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ColumnMappingElement>
    implements org.apache.avro.data.RecordBuilder<ColumnMappingElement> {

    private org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType type;
    private java.lang.String value;
    private java.lang.String columnName;
    private org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType columnType;
    private boolean partitionKey;
    private boolean clusteringKey;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.columnName)) {
        this.columnName = data().deepCopy(fields()[2].schema(), other.columnName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.columnType)) {
        this.columnType = data().deepCopy(fields()[3].schema(), other.columnType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.partitionKey)) {
        this.partitionKey = data().deepCopy(fields()[4].schema(), other.partitionKey);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.clusteringKey)) {
        this.clusteringKey = data().deepCopy(fields()[5].schema(), other.clusteringKey);
        fieldSetFlags()[5] = true;
      }
    }
    
    /** Creates a Builder by copying an existing ColumnMappingElement instance */
    private Builder(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement other) {
            super(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.columnName)) {
        this.columnName = data().deepCopy(fields()[2].schema(), other.columnName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.columnType)) {
        this.columnType = data().deepCopy(fields()[3].schema(), other.columnType);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.partitionKey)) {
        this.partitionKey = data().deepCopy(fields()[4].schema(), other.partitionKey);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.clusteringKey)) {
        this.clusteringKey = data().deepCopy(fields()[5].schema(), other.clusteringKey);
        fieldSetFlags()[5] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder setType(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'value' field */
    public java.lang.String getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder setValue(java.lang.String value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'value' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder clearValue() {
      value = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'columnName' field */
    public java.lang.String getColumnName() {
      return columnName;
    }
    
    /** Sets the value of the 'columnName' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder setColumnName(java.lang.String value) {
      validate(fields()[2], value);
      this.columnName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'columnName' field has been set */
    public boolean hasColumnName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'columnName' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder clearColumnName() {
      columnName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'columnType' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType getColumnType() {
      return columnType;
    }
    
    /** Sets the value of the 'columnType' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder setColumnType(org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType value) {
      validate(fields()[3], value);
      this.columnType = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'columnType' field has been set */
    public boolean hasColumnType() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'columnType' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder clearColumnType() {
      columnType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'partitionKey' field */
    public java.lang.Boolean getPartitionKey() {
      return partitionKey;
    }
    
    /** Sets the value of the 'partitionKey' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder setPartitionKey(boolean value) {
      validate(fields()[4], value);
      this.partitionKey = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'partitionKey' field has been set */
    public boolean hasPartitionKey() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'partitionKey' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder clearPartitionKey() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'clusteringKey' field */
    public java.lang.Boolean getClusteringKey() {
      return clusteringKey;
    }
    
    /** Sets the value of the 'clusteringKey' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder setClusteringKey(boolean value) {
      validate(fields()[5], value);
      this.clusteringKey = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'clusteringKey' field has been set */
    public boolean hasClusteringKey() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'clusteringKey' field */
    public org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElement.Builder clearClusteringKey() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public ColumnMappingElement build() {
      try {
        ColumnMappingElement record = new ColumnMappingElement();
        record.type = fieldSetFlags()[0] ? this.type : (org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnMappingElementType) defaultValue(fields()[0]);
        record.value = fieldSetFlags()[1] ? this.value : (java.lang.String) defaultValue(fields()[1]);
        record.columnName = fieldSetFlags()[2] ? this.columnName : (java.lang.String) defaultValue(fields()[2]);
        record.columnType = fieldSetFlags()[3] ? this.columnType : (org.kaaproject.kaa.server.appenders.cassandra.config.gen.ColumnType) defaultValue(fields()[3]);
        record.partitionKey = fieldSetFlags()[4] ? this.partitionKey : (java.lang.Boolean) defaultValue(fields()[4]);
        record.clusteringKey = fieldSetFlags()[5] ? this.clusteringKey : (java.lang.Boolean) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
