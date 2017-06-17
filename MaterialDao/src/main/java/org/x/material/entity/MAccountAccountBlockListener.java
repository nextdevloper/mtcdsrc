package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * アカウントマスタ	 アカウントブロック情報リスナー.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20141029.00.01
 */
public class MAccountAccountBlockListener implements EntityListener<MAccountAccountBlock> {

    @Override
    public void preInsert(final MAccountAccountBlock entity, final PreInsertContext<MAccountAccountBlock> context) {
    }

    @Override
    public void preUpdate(final MAccountAccountBlock entity, final PreUpdateContext<MAccountAccountBlock> context) {
    }

    @Override
    public void preDelete(final MAccountAccountBlock entity, final PreDeleteContext<MAccountAccountBlock> context) {
    }

    @Override
    public void postInsert(final MAccountAccountBlock entity, final PostInsertContext<MAccountAccountBlock> context) {
    }

    @Override
    public void postUpdate(final MAccountAccountBlock entity, final PostUpdateContext<MAccountAccountBlock> context) {
    }

    @Override
    public void postDelete(final MAccountAccountBlock entity, final PostDeleteContext<MAccountAccountBlock> context) {
    }
}