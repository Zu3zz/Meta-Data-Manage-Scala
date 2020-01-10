package com.zth.repository

import com.zth.domain.MetaTable
import org.springframework.data.repository.CrudRepository

/**
 * Author: 3zZ.
 * Date: 2020/1/11 4:08 上午
 */
trait MetaTableRepository extends CrudRepository[MetaTable, Integer]{
}
