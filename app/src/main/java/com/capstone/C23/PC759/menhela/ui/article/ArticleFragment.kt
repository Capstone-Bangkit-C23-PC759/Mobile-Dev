package com.capstone.c23.pc759.menhela.ui.article

import ArticleAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.capstone.c23.pc759.menhela.R

class ArticleFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var articleAdapter: ArticleAdapter
    private val articleList = mutableListOf<Article>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_article, container, false)
        recyclerView = root.findViewById(R.id.rv_article) // Mengubah ID menjadi rv_article
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        articleAdapter = ArticleAdapter(articleList)
        recyclerView.adapter = articleAdapter
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Panggil fungsi untuk mengisi data artikel ke dalam articleList
        populateArticleList()
        // Panggil fungsi untuk memperbarui tampilan RecyclerView
        articleAdapter.notifyDataSetChanged()
    }

    private fun populateArticleList() {
        // Contoh pengisian data artikel (ganti dengan sumber data Anda)
        articleList.add(Article("Judul Artikel 1", "Deskripsi Artikel 1",R.drawable.sit))
        articleList.add(Article("Judul Artikel 2", "Deskripsi Artikel 2",R.drawable.talk))
        articleList.add(Article("Judul Artikel 3", "Deskripsi Artikel 3",R.drawable.walk))
        // Tambahkan artikel lainnya sesuai kebutuhan
    }
}
