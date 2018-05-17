class ArticlesController < ApplicationController
	def index
		@articles = Article.all
		@categories = Category.all
		@articles = Article.page(params[:page]).per(5)
	end
	def show
		@article = Article.find(params[:id])
		@categories = Category.all
		@comments = Article.find(params[:id]).comments
	end
	def create
		@new = Article.create title: params[:title], content: params[:content], category_id: params[:category_id]
		if Article.create(:title => params[:title]).valid?
			redirect_to "/articles"
		else
			@yolo = {}
			@errors = @new.errors.full_messages
			# @errors.each do |error|
			# 	@yolo[error] = @errors[error]
			# end
			@articles = Article.all
			@categories = Category.all
			@articles = Article.page(params[:page]).per(5)
			render "index"
		end
	end
	def update
		@article = Article.find(params[:id])
		@categories = Category.all
		Article.find(params[:id]).update title: params[:title], content: params[:content], category_id: params[:category_id]
		if @article.update title: params[:title]
			redirect_to "/articles/#{params[:id]}"
		else
			render "show"
		end
	end
	def destroy
		Article.find(params[:id]).destroy
		redirect_to "/articles"
	end
end
