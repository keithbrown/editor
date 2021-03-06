package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/ActivitiesAdapter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_adapters.inc
// Version:      $Revision: 1.31 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class Activity_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
/**
 * This file adapts the meta-model entity; 'Activity_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class ActivitiesAdapter implements ITreeContentProvider {
	static ActivitiesAdapter activitiesadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static ActivitiesAdapter getInstance() {
		if (activitiesadapter == null) {
			activitiesadapter = new ActivitiesAdapter();
		}
		return activitiesadapter;
	}
	/**
	 * @see IContentProvider#inputChanged(Viewer, Object, Object)
	 * Called when the tree's input has been changed
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing to do
	}
	/**
	 * @see IContentProvider#dispose()
	 * Called when this viewer is no longer needed
	 */
	public void dispose() {
		// Nothing to dispose
	}
	/**
	 * @see ITreeContentProvider#getParent(Object)
	 * Returns the parent of this node
	 */
	public Object getParent(Object arg) {
		Component_c result138 = Component_c
				.getOneC_COnR4204(DomainAsComponent_c
						.getOneCN_DCOnR4204(Domain_c
								.getOneS_DOMOnR1100((Activity_c) arg)));
		if (result138 != null) {
			return result138;
		}
		SystemModel_c result139 = SystemModel_c
				.getOneS_SYSOnR1113((Activity_c) arg);
		if (result139 != null) {
			return result139;
		}
		Domain_c result140 = Domain_c.getOneS_DOMOnR1100((Activity_c) arg);
		if (result140 != null) {
			return result140;
		}
		Subsystem_c result141 = Subsystem_c.getOneS_SSOnR1108((Activity_c) arg);
		if (result141 != null) {
			return result141;
		}
		Activity_c result142 = Activity_c.getOneA_AOnR1109(ActivityInActivity_c
				.getOneA_AIAOnR1110((Activity_c) arg));
		if (result142 != null) {
			return result142;
		}
		Package_c result143 = Package_c
				.getOneEP_PKGOnR1400(SpecificationPackage_c
						.getOneEP_SPKGOnR1402((Activity_c) arg));
		if (result143 != null) {
			return result143;
		}
		ComponentPackage_c result144 = ComponentPackage_c
				.getOneCP_CPOnR1114((Activity_c) arg);
		if (result144 != null) {
			return result144;
		}
		Component_c result145 = Component_c.getOneC_COnR1115((Activity_c) arg);
		if (result145 != null) {
			return result145;
		}
		return null;
	}
	/**
	 * @see IStructuredContentProvider#getElements(Object)
	 * Returns the elements below this node
	 */
	public Object[] getElements(Object arg) {
		return getChildren(arg);
	}

	/**
	 * @see ITreeContentProvider#getChildren(Object)
	 * Returns the children of this node
	 */
	public Object[] getChildren(Object arg) {
		int resultSize = 0;
		Activity_c[] activities_1109_1 = Activity_c
				.getManyA_AsOnR1110(ActivityInActivity_c
						.getManyA_AIAsOnR1109((Activity_c) arg));

		ModelContentProvider.sort(activities_1109_1);
		resultSize += activities_1109_1.length;
		ActivityDiagramAction_c[] actions_1101_2 = ActivityDiagramAction_c
				.getManyA_GAsOnR1107(ActionNode_c
						.getManyA_ACTsOnR1105(ActivityNode_c
								.getManyA_NsOnR1101((Activity_c) arg)));

		ModelContentProvider.sort(actions_1101_2);
		resultSize += actions_1101_2.length;
		ObjectNode_c[] objectnodes_1101_3 = ObjectNode_c
				.getManyA_OBJsOnR1105(ActivityNode_c
						.getManyA_NsOnR1101((Activity_c) arg));

		ModelContentProvider.sort(objectnodes_1101_3);
		resultSize += objectnodes_1101_3.length;
		AcceptEventAction_c[] accepteventactions_1101_4 = AcceptEventAction_c
				.getManyA_AEAsOnR1112(AcceptEvent_c
						.getManyA_AEsOnR1107(ActionNode_c
								.getManyA_ACTsOnR1105(ActivityNode_c
										.getManyA_NsOnR1101((Activity_c) arg))));

		ModelContentProvider.sort(accepteventactions_1101_4);
		resultSize += accepteventactions_1101_4.length;
		SendSignal_c[] sendsignalactions_1101_5 = SendSignal_c
				.getManyA_SSsOnR1107(ActionNode_c
						.getManyA_ACTsOnR1105(ActivityNode_c
								.getManyA_NsOnR1101((Activity_c) arg)));

		ModelContentProvider.sort(sendsignalactions_1101_5);
		resultSize += sendsignalactions_1101_5.length;
		AcceptTimeEventAction_c[] accepttimeeventactions_1101_6 = AcceptTimeEventAction_c
				.getManyA_ATEsOnR1112(AcceptEvent_c
						.getManyA_AEsOnR1107(ActionNode_c
								.getManyA_ACTsOnR1105(ActivityNode_c
										.getManyA_NsOnR1101((Activity_c) arg))));

		ModelContentProvider.sort(accepttimeeventactions_1101_6);
		resultSize += accepttimeeventactions_1101_6.length;

		Object[] result = new Object[resultSize];
		int count = 0;
		for (int i = 0; i < activities_1109_1.length; i++) {
			result[count] = activities_1109_1[i];
			count++;
		}
		for (int i = 0; i < actions_1101_2.length; i++) {
			result[count] = actions_1101_2[i];
			count++;
		}
		for (int i = 0; i < objectnodes_1101_3.length; i++) {
			result[count] = objectnodes_1101_3[i];
			count++;
		}
		for (int i = 0; i < accepteventactions_1101_4.length; i++) {
			result[count] = accepteventactions_1101_4[i];
			count++;
		}
		for (int i = 0; i < sendsignalactions_1101_5.length; i++) {
			result[count] = sendsignalactions_1101_5[i];
			count++;
		}
		for (int i = 0; i < accepttimeeventactions_1101_6.length; i++) {
			result[count] = accepttimeeventactions_1101_6[i];
			count++;
		}
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		Activity_c[] activities_1109_1 = Activity_c
				.getManyA_AsOnR1110(ActivityInActivity_c
						.getManyA_AIAsOnR1109((Activity_c) arg));

		if (activities_1109_1.length > 0)
			return true;
		ActivityDiagramAction_c[] actions_1101_2 = ActivityDiagramAction_c
				.getManyA_GAsOnR1107(ActionNode_c
						.getManyA_ACTsOnR1105(ActivityNode_c
								.getManyA_NsOnR1101((Activity_c) arg)));

		if (actions_1101_2.length > 0)
			return true;
		ObjectNode_c[] objectnodes_1101_3 = ObjectNode_c
				.getManyA_OBJsOnR1105(ActivityNode_c
						.getManyA_NsOnR1101((Activity_c) arg));

		if (objectnodes_1101_3.length > 0)
			return true;
		AcceptEventAction_c[] accepteventactions_1101_4 = AcceptEventAction_c
				.getManyA_AEAsOnR1112(AcceptEvent_c
						.getManyA_AEsOnR1107(ActionNode_c
								.getManyA_ACTsOnR1105(ActivityNode_c
										.getManyA_NsOnR1101((Activity_c) arg))));

		if (accepteventactions_1101_4.length > 0)
			return true;
		SendSignal_c[] sendsignalactions_1101_5 = SendSignal_c
				.getManyA_SSsOnR1107(ActionNode_c
						.getManyA_ACTsOnR1105(ActivityNode_c
								.getManyA_NsOnR1101((Activity_c) arg)));

		if (sendsignalactions_1101_5.length > 0)
			return true;
		AcceptTimeEventAction_c[] accepttimeeventactions_1101_6 = AcceptTimeEventAction_c
				.getManyA_ATEsOnR1112(AcceptEvent_c
						.getManyA_AEsOnR1107(ActionNode_c
								.getManyA_ACTsOnR1105(ActivityNode_c
										.getManyA_NsOnR1101((Activity_c) arg))));

		if (accepttimeeventactions_1101_6.length > 0)
			return true;
		return false;
	}
}
