package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * ボックス契約マスタ（ロケーション間移動）リスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class MBoxcntrctMoveListener implements EntityListener<MBoxcntrctMove> {

    @Override
    public void preInsert(final MBoxcntrctMove entity, final PreInsertContext<MBoxcntrctMove> context) {
    }

    @Override
    public void preUpdate(final MBoxcntrctMove entity, final PreUpdateContext<MBoxcntrctMove> context) {
    }

    @Override
    public void preDelete(final MBoxcntrctMove entity, final PreDeleteContext<MBoxcntrctMove> context) {
    }

    @Override
    public void postInsert(final MBoxcntrctMove entity, final PostInsertContext<MBoxcntrctMove> context) {
    }

    @Override
    public void postUpdate(final MBoxcntrctMove entity, final PostUpdateContext<MBoxcntrctMove> context) {
    }

    @Override
    public void postDelete(final MBoxcntrctMove entity, final PostDeleteContext<MBoxcntrctMove> context) {
    }
}