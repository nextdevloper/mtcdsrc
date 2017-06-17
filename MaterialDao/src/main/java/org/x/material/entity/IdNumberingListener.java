package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * コードマスタリスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20150819.00.01
 */
public class IdNumberingListener implements EntityListener<IdNumbering> {

    @Override
    public void preInsert(final IdNumbering entity, final PreInsertContext<IdNumbering> context) {
    }

    @Override
    public void preUpdate(final IdNumbering entity, final PreUpdateContext<IdNumbering> context) {
    }

    @Override
    public void preDelete(final IdNumbering entity, final PreDeleteContext<IdNumbering> context) {
    }

    @Override
    public void postInsert(final IdNumbering entity, final PostInsertContext<IdNumbering> context) {
    }

    @Override
    public void postUpdate(final IdNumbering entity, final PostUpdateContext<IdNumbering> context) {
    }

    @Override
    public void postDelete(final IdNumbering entity, final PostDeleteContext<IdNumbering> context) {
    }
}