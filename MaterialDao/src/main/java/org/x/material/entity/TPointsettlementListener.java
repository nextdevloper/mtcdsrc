package org.x.material.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * ポイント受取支払情報リスナー.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
public class TPointsettlementListener implements EntityListener<TPointsettlement> {

    @Override
    public void preInsert(final TPointsettlement entity, final PreInsertContext<TPointsettlement> context) {
    }

    @Override
    public void preUpdate(final TPointsettlement entity, final PreUpdateContext<TPointsettlement> context) {
    }

    @Override
    public void preDelete(final TPointsettlement entity, final PreDeleteContext<TPointsettlement> context) {
    }

    @Override
    public void postInsert(final TPointsettlement entity, final PostInsertContext<TPointsettlement> context) {
    }

    @Override
    public void postUpdate(final TPointsettlement entity, final PostUpdateContext<TPointsettlement> context) {
    }

    @Override
    public void postDelete(final TPointsettlement entity, final PostDeleteContext<TPointsettlement> context) {
    }
}