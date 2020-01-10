package com.zth.service

import com.zth.domain.MetaTable
import com.zth.repository.MetaTableRepository
import javax.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Author: 3zZ.
 * Date: 2020/1/11 4:09 上午
 */
@Service
class MetaTableService @Autowired()(metaTableReposiroty:MetaTableRepository){
  @Transactional
  def save(metaTable:MetaTable) = {
    metaTableReposiroty.save(metaTable)
  }
  def query() = {
    metaTableReposiroty.findAll()
  }
}
