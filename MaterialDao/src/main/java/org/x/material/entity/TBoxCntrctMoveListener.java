package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * ボックス契約取引情報（ロケーション間移動）リスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class TBoxCntrctMoveListener implements EntityListener<TBoxCntrctMove> {

    @Override
    public void preInsert(final TBoxCntrctMove entity, final PreInsertContext<TBoxCntrctMove> context) {
    }

    @Override
    public void preUpdate(final TBoxCntrctMove entity, final PreUpdateContext<TBoxCntrctMove> context) {
    }

    @Override
    public void preDelete(final TBoxCntrctMove entity, final PreDeleteContext<TBoxCntrctMove> context) {
    }

    @Override
    public void postInsert(final TBoxCntrctMove entity, final PostInsertContext<TBoxCntrctMove> context) {
    }

    @Override
    public void postUpdate(final TBoxCntrctMove entity, final PostUpdateContext<TBoxCntrctMove> context) {
    }

    @Override
    public void postDelete(final TBoxCntrctMove entity, final PostDeleteContext<TBoxCntrctMove> context) {
    }
}