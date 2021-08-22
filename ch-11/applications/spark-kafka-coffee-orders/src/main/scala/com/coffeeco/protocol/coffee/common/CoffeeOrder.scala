// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.coffeeco.protocol.coffee.common

@SerialVersionUID(0L)
final case class CoffeeOrder(
    timestamp: _root_.scala.Long = 0L,
    orderId: _root_.scala.Predef.String = "",
    storeId: _root_.scala.Predef.String = "",
    customerId: _root_.scala.Predef.String = "",
    numItems: _root_.scala.Int = 0,
    price: _root_.scala.Float = 0.0f,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[CoffeeOrder] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = timestamp
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt64Size(1, __value)
        }
      };
      
      {
        val __value = orderId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = storeId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = customerId
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = numItems
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(5, __value)
        }
      };
      
      {
        val __value = price
        if (__value != 0.0f) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeFloatSize(6, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = timestamp
        if (__v != 0L) {
          _output__.writeUInt64(1, __v)
        }
      };
      {
        val __v = orderId
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = storeId
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = customerId
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      {
        val __v = numItems
        if (__v != 0) {
          _output__.writeUInt32(5, __v)
        }
      };
      {
        val __v = price
        if (__v != 0.0f) {
          _output__.writeFloat(6, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withTimestamp(__v: _root_.scala.Long): CoffeeOrder = copy(timestamp = __v)
    def withOrderId(__v: _root_.scala.Predef.String): CoffeeOrder = copy(orderId = __v)
    def withStoreId(__v: _root_.scala.Predef.String): CoffeeOrder = copy(storeId = __v)
    def withCustomerId(__v: _root_.scala.Predef.String): CoffeeOrder = copy(customerId = __v)
    def withNumItems(__v: _root_.scala.Int): CoffeeOrder = copy(numItems = __v)
    def withPrice(__v: _root_.scala.Float): CoffeeOrder = copy(price = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = timestamp
          if (__t != 0L) __t else null
        }
        case 2 => {
          val __t = orderId
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = storeId
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = customerId
          if (__t != "") __t else null
        }
        case 5 => {
          val __t = numItems
          if (__t != 0) __t else null
        }
        case 6 => {
          val __t = price
          if (__t != 0.0f) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PLong(timestamp)
        case 2 => _root_.scalapb.descriptors.PString(orderId)
        case 3 => _root_.scalapb.descriptors.PString(storeId)
        case 4 => _root_.scalapb.descriptors.PString(customerId)
        case 5 => _root_.scalapb.descriptors.PInt(numItems)
        case 6 => _root_.scalapb.descriptors.PFloat(price)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.coffeeco.protocol.coffee.common.CoffeeOrder
    // @@protoc_insertion_point(GeneratedMessage[CoffeeOrder])
}

object CoffeeOrder extends scalapb.GeneratedMessageCompanion[com.coffeeco.protocol.coffee.common.CoffeeOrder] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.coffeeco.protocol.coffee.common.CoffeeOrder] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.coffeeco.protocol.coffee.common.CoffeeOrder = {
    var __timestamp: _root_.scala.Long = 0L
    var __orderId: _root_.scala.Predef.String = ""
    var __storeId: _root_.scala.Predef.String = ""
    var __customerId: _root_.scala.Predef.String = ""
    var __numItems: _root_.scala.Int = 0
    var __price: _root_.scala.Float = 0.0f
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 8 =>
          __timestamp = _input__.readUInt64()
        case 18 =>
          __orderId = _input__.readStringRequireUtf8()
        case 26 =>
          __storeId = _input__.readStringRequireUtf8()
        case 34 =>
          __customerId = _input__.readStringRequireUtf8()
        case 40 =>
          __numItems = _input__.readUInt32()
        case 53 =>
          __price = _input__.readFloat()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    com.coffeeco.protocol.coffee.common.CoffeeOrder(
        timestamp = __timestamp,
        orderId = __orderId,
        storeId = __storeId,
        customerId = __customerId,
        numItems = __numItems,
        price = __price,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.coffeeco.protocol.coffee.common.CoffeeOrder] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.coffeeco.protocol.coffee.common.CoffeeOrder(
        timestamp = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        orderId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        storeId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        customerId = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        numItems = __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        price = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Float]).getOrElse(0.0f)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CoffeeCommonProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CoffeeCommonProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.coffeeco.protocol.coffee.common.CoffeeOrder(
    timestamp = 0L,
    orderId = "",
    storeId = "",
    customerId = "",
    numItems = 0,
    price = 0.0f
  )
  implicit class CoffeeOrderLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.coffeeco.protocol.coffee.common.CoffeeOrder]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.coffeeco.protocol.coffee.common.CoffeeOrder](_l) {
    def timestamp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.timestamp)((c_, f_) => c_.copy(timestamp = f_))
    def orderId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.orderId)((c_, f_) => c_.copy(orderId = f_))
    def storeId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.storeId)((c_, f_) => c_.copy(storeId = f_))
    def customerId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.customerId)((c_, f_) => c_.copy(customerId = f_))
    def numItems: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.numItems)((c_, f_) => c_.copy(numItems = f_))
    def price: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Float] = field(_.price)((c_, f_) => c_.copy(price = f_))
  }
  final val TIMESTAMP_FIELD_NUMBER = 1
  final val ORDER_ID_FIELD_NUMBER = 2
  final val STORE_ID_FIELD_NUMBER = 3
  final val CUSTOMER_ID_FIELD_NUMBER = 4
  final val NUM_ITEMS_FIELD_NUMBER = 5
  final val PRICE_FIELD_NUMBER = 6
  def of(
    timestamp: _root_.scala.Long,
    orderId: _root_.scala.Predef.String,
    storeId: _root_.scala.Predef.String,
    customerId: _root_.scala.Predef.String,
    numItems: _root_.scala.Int,
    price: _root_.scala.Float
  ): _root_.com.coffeeco.protocol.coffee.common.CoffeeOrder = _root_.com.coffeeco.protocol.coffee.common.CoffeeOrder(
    timestamp,
    orderId,
    storeId,
    customerId,
    numItems,
    price
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[CoffeeOrder])
}
