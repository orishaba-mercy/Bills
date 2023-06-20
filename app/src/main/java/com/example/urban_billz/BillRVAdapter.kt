package com.example.contactsapp

import android.content.Intent
import android.icu.util.CurrencyAmount
import android.provider.ContactsContract.Contacts
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.contactsapp.databinding.ContactListItemBinding
import com.example.urban_billz.PersonsData
import com.example.urban_billz.databinding.BillListViewBinding
import com.squareup.picasso.Picasso
import java.time.Instant
import java.util.Currency


class BillRVAdapter (var contactList: List<PersonsData>):RecyclerView.Adapter<BillRVAdapter.BillViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): BillViewHolder{
        val binding=BillListViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BillViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BillListViewBinding, position: Int) {
        val currentList =BillList.get(position)
        val binding=holder.binding
        binding.tvName.text=currentList.Username
        binding.tvPhoneNumber.text =currentList.PhoneNumber
        binding.tvEmail.text=currentList.email
        binding.ivPassWord.text=currentList.PassWord

        }

    }

    class BillViewHolder(var binding: BillListViewBinding):RecyclerView.ViewHolder(binding.root)

