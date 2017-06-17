package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 組織情報マスタリスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class MStructAccListener implements EntityListener<MStructAcc> {

    @Override
    public void preInsert(final MStructAcc entity, final PreInsertContext<MStructAcc> context) {
    }

    @Override
    public void preUpdate(final MStructAcc entity, final PreUpdateContext<MStructAcc> context) {
    }

    @Override
    public void preDelete(final MStructAcc entity, final PreDeleteContext<MStructAcc> context) {
    }

    @Override
    public void postInsert(final MStructAcc entity, final PostInsertContext<MStructAcc> context) {
    }

    @Override
    public void postUpdate(final MStructAcc entity, final PostUpdateContext<MStructAcc> context) {
    }

    @Override
    public void postDelete(final MStructAcc entity, final PostDeleteContext<MStructAcc> context) {
    }
}