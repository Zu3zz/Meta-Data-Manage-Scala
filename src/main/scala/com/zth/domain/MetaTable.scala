package com.zth.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}

import scala.beans.BeanProperty

/**
 * Author: 3zZ.
 * Date: 2020/1/11 4:05 上午
 */
@Entity
@Table
class MetaTable {
  @Id
  @GeneratedValue
  @BeanProperty
  var id:Integer = _
  @BeanProperty
  var name:String = _
  @BeanProperty
  var tableType: String = _
  @BeanProperty
  var dbId:Integer = _

}
