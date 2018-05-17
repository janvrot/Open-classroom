class CommentsController < ApplicationController
	def create
		Comment.create author: params[:author], content: params[:art_content], article_id: params[:id]
		redirect_to "/articles/#{params[:id]}" 
	end
	def destroy
		Comment.find(params[:com_id]).destroy
		redirect_to "/articles/#{params[:art_id]}"
	end
end
