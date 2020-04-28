package com.divoc.states;

import com.divoc.contracts.DonateContract;
import net.corda.core.contracts.BelongsToContract;
import net.corda.core.contracts.LinearState;
import net.corda.core.contracts.UniqueIdentifier;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;

import java.util.Arrays;
import java.util.List;

// *********
// * State *
// *********
@BelongsToContract(DonateContract.class)
public class DonateState implements LinearState {

    private final String idDonante;
    private final String idDonatario;
    private final String idItem;
    private final String propietario;
    private final String estado;
    private final String ubicacion;
    private final Party sender;
    private final Party reciever;
    private final UniqueIdentifier linearId;

    public DonateState(String idDonante, String idDonatario,
                       String idItem, String propietario,
                       String estado, String ubicacion, Party sender, Party reciever, UniqueIdentifier linearId) {
        this.idDonante = idDonante;
        this.idDonatario = idDonatario;
        this.idItem = idItem;
        this.propietario = propietario;
        this.estado = estado;
        this.ubicacion = ubicacion;
        this.sender = sender;
        this.reciever = reciever;
        this.linearId = linearId;
    }


    @Override
    public UniqueIdentifier getLinearId() {
        return linearId;
    }

    @Override
    public List<AbstractParty> getParticipants() {
        return Arrays.asList(sender, reciever);
    }

    public String getIdDonante() {
        return idDonante;
    }

    public String getIdDonatario() {
        return idDonatario;
    }

    public String getIdItem() {
        return idItem;
    }

    public String getPropietario() {
        return propietario;
    }


    public String getEstado() {
        return estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}